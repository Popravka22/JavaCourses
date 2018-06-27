package ru.java.courses.football;

import java.util.ArrayList;

public class Team {
    private final static int MAX_PLAYERS_COUNT = 20;
    private final static int ACTIVE_PLAYERS_COUNT = 11;
    private String teamName;
    private Coach coach;
    private ArrayList<Player> players = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addPlayer(Player player){
        players.add(player);
    }


    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", coach=" + coach +
                ", players=" + players +
                '}';
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
}
