package com.gitlab.emradbuba.learning.java_examples.java8.streams.collect;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingCollectorDemo {

    public static final List<Person> LIST_OF_PERSONS = List.of(
            new Person("Jack", 12),
            new Person("Jessy", 39),
            new Person("Maria", 42),
            new Person("Ping", 26),
            new Person("Pong", 26),
            new Person("Jessy", 31),
            new Person("Manuela", 14),
            new Person("Jessica", 18)
    );

    public static void main(String[] args) {
        example0();
        example1();
        example2();
        example3();
    }

    private static void example3() {
        // Names of adults and non adults as TreeSet:
        Map<Boolean, TreeSet<String>> unmodifiableMap = LIST_OF_PERSONS
                .stream()
                .collect(Collectors.collectingAndThen(
                                Collectors.groupingBy(
                                        person -> person.age() >= 18,
                                        Collectors.mapping(
                                                Person::name,
                                                Collectors.toCollection(TreeSet::new)
                                        )),
                        Collections::unmodifiableMap
                        )
                );
        System.out.println("Adults names (tree set): " + unmodifiableMap.get(true));
        System.out.println("Not yet adults names (tree set): " + unmodifiableMap.get(false));
    }

    private static void example0() {
        // Group by adulthood
        Map<Boolean, List<Person>> groupedByAdulthood = LIST_OF_PERSONS.stream()
                .collect(Collectors.groupingBy(person -> person.age() >= 18));
        System.out.println("Adults: " + groupedByAdulthood.get(true));
        System.out.println("Not yet adults: " + groupedByAdulthood.get(false));
    }

    private static void example2() {
        // Names of adults and non adults:
        Map<Boolean, List<String>> groupedByAdulthoodWithNames = LIST_OF_PERSONS
                .stream()
                .collect(Collectors.groupingBy(
                        person -> person.age() >= 18,
                        Collectors.mapping(Person::name, Collectors.toList()))
                );
        System.out.println("Adults names: " + groupedByAdulthoodWithNames.get(true));
        System.out.println("Not yet adults names: " + groupedByAdulthoodWithNames.get(false));
    }

    private static void example1() {
        // Numbers of adults and non adults:
        Map<Boolean, Long> groupedByAdulthoodWithCounter = LIST_OF_PERSONS
                .stream()
                .collect(Collectors.groupingBy(
                        person -> person.age() >= 18,
                        Collectors.counting())
                );
        System.out.println("Adults count: " + groupedByAdulthoodWithCounter.get(true));
        System.out.println("Not yet adults count: " + groupedByAdulthoodWithCounter.get(false));
    }
}
