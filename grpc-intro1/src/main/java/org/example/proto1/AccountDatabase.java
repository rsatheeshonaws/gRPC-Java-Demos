package org.example.proto1;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AccountDatabase {
    private static Map<Integer, Integer> balanceMap = IntStream
            .rangeClosed(1, 10)
            .boxed()
            .collect(Collectors.toMap(Function.identity(), p -> p * 100));

    public static Integer getBalance(int accountNumber) {
        return balanceMap.get(accountNumber);
    }

    public static Integer addAmount(int accountId, int newAmount) {
        return balanceMap.computeIfPresent(accountId, (k, v) -> v + newAmount);
    }

    public static Integer debitAmount(int accountId, int newAmount) {
        return balanceMap.computeIfPresent(accountId, (k, v) -> v - newAmount);
    }

    public static void printAccounts() {
        System.out.println(balanceMap);
    }
}
