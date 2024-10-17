package com.automation.designPattern.lldtictactoe.gamemanagement;

import com.automation.designPattern.lldtictactoe.usermanagement.User;

public class Player {
    private User userDetails;
    private String gameName;
    private Symbol userSymbol;

    public User getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(User userDetails) {
        this.userDetails = userDetails;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public Symbol getUserSymbol() {
        return userSymbol;
    }

    public void setUserSymbol(Symbol userSymbol) {
        this.userSymbol = userSymbol;
    }
}
