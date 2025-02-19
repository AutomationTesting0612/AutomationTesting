package com.automation.designPattern.lldtictactoe.gamemanagement;

public interface BoardFeatures {

    public void judge();
    void announceTurn(Player p);
    Integer makeChoice(Player p);
    Boolean isValid(Integer choice);
    void doChanges(Integer choice , Player p);
    void MakeMove();
}
