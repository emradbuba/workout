package io.github.guit4rfre4k.examples.java8.utils;

import java.util.Arrays;
import java.util.List;

public class TestDataProvider {

    public static List<Person> getSampleEmployeeList() {
        return Arrays.asList(
                new Person("Andy", "Daniels", JobLevel.QA, 44),
                new Person("Kate", "White", JobLevel.SOFTWARE_ARCHITECT, 53),
                new Person("Dennis", "Kernighan", JobLevel.SOFTWARE_DEVELOPER, 19),
                new Person("Jack", "Brown", JobLevel.QA, 33),
                new Person("Marcus", "Teaspoon", JobLevel.SOFTWARE_ARCHITECT, 56)
        );
    }
}
