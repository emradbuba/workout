package com.gitlab.emradbuba.learning.java_examples.java14.record;

import java.util.Objects;

public record RecordDto(Long id, String firstName, String secondName, String surname, Integer age) {
    // BY DEFAULT:
    // 1. PRIVATE FINAL -> id, firstName, secondName, surname, age
    // 2. public accessors
    // 3. public constructor for all components
    // 4. equals and hashCode using all members
    // 5. toString()

    RecordDto(Long id, String firstName, String surname, int age) {
        this(id, firstName, "", surname, age);
    }

    public RecordDto {
        // Compact constructor - invoked before original assignments, so cannot use this.id, ...
        // Perfect for arguments validation, adjustment  etc...
        System.out.println("(Invoking compact constructor...)");

        // sample customization/adjustment
        firstName = firstName.toUpperCase();
        surname = surname.toUpperCase();

        // sample validation
        Objects.requireNonNull(id, "Id cannot be null");
        Objects.requireNonNull(firstName, "First name cannot be null");
        Objects.requireNonNull(surname, "Surname cannot be null");
        Objects.requireNonNull(age, "Age cannot be null");
    }

    public String introduceMe() {
        return String.format("Hi! I am %s %s and I'm %d years old", firstName, surname, age);
    }
}