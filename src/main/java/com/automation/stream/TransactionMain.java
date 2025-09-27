package com.automation.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionMain {

    public static void main(String[] args) {


        List<Transaction> transaction= Arrays.asList(new Transaction(1, 12, "GROCERY"),
        new Transaction(2, 2, "ELECTRONICS"),
                new Transaction(3, 3, "GROCERY"),
        new Transaction(4, 4, "GROCERY")
                );

        List<Integer> transactionIds= transaction.stream().filter(n -> n.getType().equals("GROCERY"))
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .map(Transaction::getId)
                .collect(Collectors.toList());

        System.out.println(transactionIds);


    }
}
