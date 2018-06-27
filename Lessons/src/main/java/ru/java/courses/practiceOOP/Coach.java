package ru.java.courses.practiceOOP;

import java.util.Objects;

public class Coach extends Person {

    private int experience;

    public Coach(String name, int age) {
        super(name, age);
    }


    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coach)) return false;
        if (!super.equals(o)) return false;
        Coach coach = (Coach) o;
        return getExperience() == coach.getExperience();
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getExperience());
    }

    @Override
    public String toString() {
        return "Coach{" +
                "experience=" + experience +
                "} " + super.toString();
    }
}
