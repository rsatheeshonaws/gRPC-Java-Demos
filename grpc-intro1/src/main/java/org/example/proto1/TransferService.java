package org.example.proto1;

import io.grpc.stub.StreamObserver;
import org.example.proto1.models.TransferRequest;
import org.example.proto1.models.TransferResponse;
import org.example.proto1.models.TransferServiceGrpc;
import org.example.proto1.models.TransferStatus;

public class TransferService extends TransferServiceGrpc.TransferServiceImplBase {
    @Override
    public synchronized StreamObserver<TransferRequest> transferMoney(StreamObserver<TransferResponse> responseObserver) {
        return new TransferRequestStream(responseObserver);
    }

    public static class TransferRequestStream implements StreamObserver<TransferRequest> {
        private StreamObserver<TransferResponse> responseObserver;

        public TransferRequestStream(StreamObserver<TransferResponse> responseObserver) {
            this.responseObserver = responseObserver;
        }

        @Override
        public void onNext(TransferRequest transferRequest) {

            var fromAccount = transferRequest.getFromAccount();
            var toAccount = transferRequest.getToAccount();
            var amountToBeTransferred = transferRequest.getAmount();
            var fromAccountBalanceAvailable = AccountDatabase.getBalance(fromAccount);

            var transferStatus = TransferStatus.FAILED;

            if (fromAccountBalanceAvailable >= amountToBeTransferred && fromAccount != toAccount && toAccount != 0) {
                AccountDatabase.debitAmount(fromAccount, amountToBeTransferred);
                AccountDatabase.addAmount(toAccount, amountToBeTransferred);
                transferStatus = TransferStatus.SUCCESS;
            }

            TransferResponse response = org.example.proto1.models.TransferResponse.newBuilder()
                    .addAccounts(org.example.proto1.models.Account.newBuilder()
                            .setAccountNumber(fromAccount)
                            .setAmount(AccountDatabase.getBalance(fromAccount))
                            .build())
                    .addAccounts(org.example.proto1.models.Account.newBuilder()
                            .setAccountNumber(toAccount)
                            .setAmount(AccountDatabase.getBalance(toAccount))
                            .build())
                    .setStatus(transferStatus)
                    .build();
            this.responseObserver.onNext(response);
        }

        @Override
        public void onError(Throwable throwable) {

        }

        @Override
        public void onCompleted() {

            AccountDatabase.printAccounts();
            responseObserver.onCompleted();

        }
    }
}
