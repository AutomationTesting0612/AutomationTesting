package com.automation.designPattern.lldtictactoe.gamemanagement;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Symbol {

    START('*'),CROSS('X'), ZERO('0');

    private Character val;

    Symbol(Character value) {
        this.val = value;
    }

    @JsonValue
    public Character getValue() {
        return val;
    }
}
