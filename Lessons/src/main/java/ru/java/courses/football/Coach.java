package ru.java.courses.football;

public class Coach extends Person {
    private int experience;

    public Coach(String name) {
        this.name = name;
        this.experience = 0;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "experience=" + experience +
                ", name='" + name + "'" +
                '}';
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
