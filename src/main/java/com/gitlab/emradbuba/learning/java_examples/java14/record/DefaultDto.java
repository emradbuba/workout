package com.gitlab.emradbuba.learning.java_examples.java14.record;

import java.util.Objects;

public class DefaultDto {
    private final Long id;
    private final String firstName;
    private final String secondName;
    private final String surname;
    private final Integer age;

    public DefaultDto(Long id, String firstName, String secondName, String surname, Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
        this.age = age;
    }

    public DefaultDto(Long id, String firstName, String surname, Integer age) {
        this(id, firstName, "", surname, age);
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String introduceMe(){
        return String.format("Hi! I am %s %s and I'm %d years old", firstName, surname, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DefaultDto that = (DefaultDto) o;

        if (!id.equals(that.id)) return false;
        if (!firstName.equals(that.firstName)) return false;
        if (!Objects.equals(secondName, that.secondName)) return false;
        if (!surname.equals(that.surname)) return false;
        return age.equals(that.age);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + surname.hashCode();
        result = 31 * result + age.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "DefaultDto{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
