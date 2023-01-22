package org.example.proto1;

import io.grpc.stub.StreamObserver;
import org.example.proto1.models.Balance;
import org.example.proto1.models.DepositRequest;

public class ClientStreamingRequest implements StreamObserver<DepositRequest> {

    private StreamObserver<Balance> balanceStreamObserver;
    private int balance;

    public ClientStreamingRequest(StreamObserver<Balance> responseObserver) {
        this.balanceStreamObserver = responseObserver;
    }

    @Override
    public void onNext(DepositRequest depositRequest) {
        int accountNumber = depositRequest.getAccountNumber();
        int amount = depositRequest.getAmount();
        balance = AccountDatabase.addAmount(accountNumber, amount);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println(throwable.getMessage());
    }

    @Override
    public void onCompleted() {
        balanceStreamObserver.onNext(org.example.proto1.models.Balance.newBuilder()
                .setAmount(balance)
                .build());
        balanceStreamObserver.onCompleted();
    }
}
