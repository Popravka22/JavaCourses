package ru.reksoft.football;

public class Player extends Person {
    private int goalCount;
    private boolean isActive = false;
    private PlayerType playerType;


    public Player(String name, PlayerType playerType, int goalCount) {
        this.name = name;
        this.playerType = playerType;
        this.goalCount = goalCount;
    }

    @Override
    public String toString() {
        return "Player{" +
                "goalCount=" + goalCount +
                ", isActive=" + isActive +
                ", playerType=" + playerType +
                ", name='" + name + '\'' +
                '}';
    }

    public int getGoalCount() {
        return goalCount;
    }

    public void setGoalCount(int goalCount) {
        this.goalCount = goalCount;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
