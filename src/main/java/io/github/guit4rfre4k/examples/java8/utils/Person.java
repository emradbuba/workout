package io.github.guit4rfre4k.examples.java8.utils;

public class Person {

    private final String name;
    private final String surname;
    private final JobLevel jobLevel;
    private final int age;

    public Person(String name, String surname, JobLevel jobLevel) {
        this(name, surname, jobLevel, 0);
    }

    public Person(String name, String surname, JobLevel jobLevel, int age) {
        this.name = name;
        this.surname = surname;
        this.jobLevel = jobLevel;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public JobLevel getJobLevel() {
        return jobLevel;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person -> " + name + " " + surname + " (" + jobLevel + ")";
    }
}
