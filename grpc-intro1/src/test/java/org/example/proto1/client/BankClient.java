package org.example.proto1.client;


import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.example.proto1.models.Balance;
import org.example.proto1.models.BalanceCheckRequest;
import org.example.proto1.models.Money;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;

import static org.example.proto1.models.BankServiceGrpc.BankServiceBlockingStub;
import static org.example.proto1.models.BankServiceGrpc.BankServiceStub;
import static org.example.proto1.models.TransferServiceGrpc.TransferServiceStub;

/**
 * Channel : connection between client and server
 *   - persistent (default 30 mins)
 *   - used for multiple concurrent requests
 *   - idle connections closed by server if new version app deployed, app crashes
 *   - can share with multiple stubs
 *   - expensive operation
 *   - thread safe
 *
 */

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BankClient {

    BankServiceBlockingStub bankServiceBlockingStub;
    BankServiceStub bankServiceStub;
    TransferServiceStub transferServiceStub;

    @BeforeAll
    public void setUp() {
        var managedChannel = ManagedChannelBuilder.
                forAddress("localhost", 8180)
                .usePlaintext().build();

        bankServiceBlockingStub = org.example.proto1.models.BankServiceGrpc.newBlockingStub(managedChannel);
        bankServiceStub = org.example.proto1.models.BankServiceGrpc.newStub(managedChannel);
        transferServiceStub = org.example.proto1.models.TransferServiceGrpc.newStub(managedChannel);
    }

    @Test
    public void testBalance() {
        var balanceCheckRequest = BalanceCheckRequest.newBuilder()
                .setAccountNumber(7)
                .build();
        var balance = bankServiceBlockingStub.getBalance(balanceCheckRequest);

        Assertions.assertEquals(10 * 100, balance.getAmount());
    }

    @Test
    public void testWithdraw() {
        var withdrawRequest = org.example.proto1.models.WithdrawRequest.newBuilder()
                .setAccountNumber(7)
                .setAmount(40)
                .build();
        var moneyIterator = bankServiceBlockingStub.withdrawMoney(withdrawRequest);

        moneyIterator.forEachRemaining(money -> System.out.println("Received : " + money));
    }

    @Test
    public void testWithdrawAsync() throws InterruptedException {
        var withdrawRequest = org.example.proto1.models.WithdrawRequest.newBuilder()
                .setAccountNumber(7)
                .setAmount(40)
                .build();
        CountDownLatch latch = new CountDownLatch(1);
        bankServiceStub.withdrawMoney(withdrawRequest, new StreamObserver<Money>() {
            @Override
            public void onNext(Money money) {
                System.out.println("Received : " + money);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Server done");
                latch.countDown();
            }
        });

        System.out.println("Async client");
        latch.await();
        // Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    }

    @Test
    public void testDeposit() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<org.example.proto1.models.DepositRequest> streamObserver
                = bankServiceStub.depositMoney(new StreamObserver<Balance>() {
            @Override
            public void onNext(Balance balance) {
                System.out.println("Final balance : " + balance);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Server done");
                latch.countDown();
            }
        });


        // Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        for (int i = 0; i < 10; i++) {
            streamObserver.onNext(org.example.proto1.models.DepositRequest.newBuilder()
                    .setAccountNumber(2)
                    .setAmount(10)
                    .build());
        }

        streamObserver.onCompleted();

        latch.await();
    }

    @Test
    public void testTransfer() throws InterruptedException {
        var latch = new CountDownLatch(1);
        var streamObserver
                = transferServiceStub.transferMoney(new TransferResponseStream(latch));
        for (int i = 0; i < 10; i++) {
            streamObserver.onNext(org.example.proto1.models.TransferRequest.newBuilder()
                    .setAmount(ThreadLocalRandom.current().nextInt(1, 20))
                    .setFromAccount(ThreadLocalRandom.current().nextInt(1, 11))
                    .setToAccount(ThreadLocalRandom.current().nextInt(1, 11))
                    .build());
        }

        streamObserver.onCompleted();

        latch.await();
    }


    public static class TransferResponseStream implements StreamObserver<org.example.proto1.models.TransferResponse> {

        private final CountDownLatch latch;

        public TransferResponseStream(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void onNext(org.example.proto1.models.TransferResponse transferResponse) {

            System.out.println("Transfer status : " + transferResponse.getStatus());

            transferResponse.getAccountsList().stream()
                    .map(account -> account.getAccountNumber() + ":" + account.getAmount())
                    .forEach(System.out::println);

        }

        @Override
        public void onError(Throwable throwable) {

        }

        @Override
        public void onCompleted() {

            latch.countDown();
        }
    }

}
