package ru.java.courses.practiceOOP.athletics;

import ru.java.courses.practiceOOP.Athlete;
import ru.java.courses.practiceOOP.Coach;
import ru.java.courses.practiceOOP.SportTitle;

import java.util.Objects;

public class Runner extends Athlete {

    private Coach coach;
    private double personalRecord = 0.0;

    public Runner(String name, int age) {
        super(name, age);
    }

    public Runner(String name, int age, SportTitle title) {
        super(name, age, title);
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public double getPersonalRecord() {
        return personalRecord;
    }

    public void setPersonalRecord(double personalRecord) {
        this.personalRecord = personalRecord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Runner)) return false;
        if (!super.equals(o)) return false;
        Runner runner = (Runner) o;
        return Double.compare(runner.getPersonalRecord(), getPersonalRecord()) == 0 &&
                Objects.equals(getCoach(), runner.getCoach());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getCoach(), getPersonalRecord());
    }
}
