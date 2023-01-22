package org.example.proto1;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.example.proto1.models.Balance;
import org.example.proto1.models.BalanceCheckRequest;
import org.example.proto1.models.BankServiceGrpc;
import org.example.proto1.models.WithdrawRequest;

public class BankService extends BankServiceGrpc.BankServiceImplBase {

    @Override
    public void getBalance(BalanceCheckRequest request, StreamObserver<Balance> responseObserver) {
        int accountNumber = request.getAccountNumber();
        Balance balance = Balance.newBuilder()
                .setAmount(AccountDatabase.getBalance(accountNumber))
                .build();

        responseObserver.onNext(balance);
        responseObserver.onCompleted();
    }

    @Override
    public void withdrawMoney(WithdrawRequest request,
                              StreamObserver<org.example.proto1.models.Money> responseObserver) {
        int accountNumber = request.getAccountNumber();
        int amountToBeDebited = request.getAmount();
        int balanceInAccount = AccountDatabase.getBalance(accountNumber);

        if (amountToBeDebited > balanceInAccount) {
            Status status = Status.FAILED_PRECONDITION.withDescription("Not enough money in account");
            responseObserver.onError(status.asRuntimeException());
            return;
        }

        for (int i = 0; i < (amountToBeDebited / 10); i++) {
            org.example.proto1.models.Money money
                    = org.example.proto1.models.Money.newBuilder()
                    .setValue(10)
                    .build();
            responseObserver.onNext(money);
            AccountDatabase.debitAmount(accountNumber, 10);
        }

        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<org.example.proto1.models.DepositRequest> depositMoney(StreamObserver<Balance> responseObserver) {
        return new ClientStreamingRequest(responseObserver);
    }
}
