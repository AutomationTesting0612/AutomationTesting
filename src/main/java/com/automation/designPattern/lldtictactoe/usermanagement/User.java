package com.automation.designPattern.lldtictactoe.usermanagement;

public class User {

    private Integer gameId;

    private Statistics stats;

    private PersonalDetails personalDetails;

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Statistics getStats() {
        return stats;
    }

    public void setStats(Statistics stats) {
        this.stats = stats;
    }

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }
}
