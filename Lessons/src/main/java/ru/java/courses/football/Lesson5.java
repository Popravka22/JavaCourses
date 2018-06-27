package ru.java.courses.football;

public class Lesson5 {
    public static void main(String[] args) {

        Team champion = new Team("Champion");

        champion.addPlayer(new Player("Vasya", PlayerType.DEFENDER, 5));

        champion.setCoach(new Coach("Lev Landau", 50));
        System.out.println(champion.toString());
    }
}
