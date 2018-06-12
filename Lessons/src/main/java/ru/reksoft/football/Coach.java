package ru.reksoft.football;

public class Coach extends Person {
    private int experience;

    public Coach(String name, int experience) {
        this.name = name;
        this.experience = experience;
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
