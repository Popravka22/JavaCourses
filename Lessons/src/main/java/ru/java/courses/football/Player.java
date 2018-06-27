package ru.java.courses.football;

public class Player extends Person {
    private int goalCount;
    private boolean isActive = false;
    private PlayerRole playerRole;


    public Player(String name, PlayerRole playerRole) {
        this.name = name;
        this.playerRole = playerRole;
        this.goalCount = 0;
    }

    @Override
    public String toString() {
        return "Player{" +
                "goalCount=" + goalCount +
                ", isActive=" + isActive +
                ", playerRole=" + playerRole +
                ", name='" + name + '\'' +
                '}';
    }

    public void Score() { this.goalCount++; }

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

    public PlayerRole getPlayerRole() {
        return playerRole;
    }

    public void setPlayerRole(PlayerRole playerRole) {
        this.playerRole = playerRole;
    }
}
