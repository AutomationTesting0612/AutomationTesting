package com.automation.stream;

public class Transaction {

    private int id;
    private int value;
    private String type;

    public Transaction(int id, int value, String type) {
        this.id = id;
        this.value = value;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public String getType() {
        return type;
    }
}
