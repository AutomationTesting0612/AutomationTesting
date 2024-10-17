package com.automation.designPattern.lldtictactoe.gamemanagement;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EventType {

    WIN("Congratulations"), DRAW("This game is tie"), ONGOING("This game is still on going");

    private String value;

    EventType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue(){
        return value;
    }
}
