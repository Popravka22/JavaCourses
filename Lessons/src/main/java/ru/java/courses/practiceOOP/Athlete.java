package ru.java.courses.practiceOOP;

import java.util.Objects;

public class Athlete extends Person {
    private SportTitle title = SportTitle.NO_TITLE;


    public Athlete(String name, int age) {
        super(name, age);
    }

    public Athlete(String name, int age, SportTitle title) {

        super(name, age);
        this.title = title;
    }

    public SportTitle getTitle() {
        return title;
    }

    public void setTitle(SportTitle title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Athlete)) return false;
        if (!super.equals(o)) return false;
        Athlete athlete = (Athlete) o;
        return getTitle() == athlete.getTitle();
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getTitle());
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "title=" + title +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }


}
