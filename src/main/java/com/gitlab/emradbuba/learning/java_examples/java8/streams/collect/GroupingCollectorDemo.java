package com.gitlab.emradbuba.learning.java_examples.java8.streams.collect;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingCollectorDemo {
    public static void main(String[] args) {
        List<Person> listOfPersons = List.of(
                new Person("Jack", 12),
                new Person("Jessy", 39),
                new Person("Maria", 42),
                new Person("Ping", 26),
                new Person("Pong", 26),
                new Person("Jessy", 31),
                new Person("Manuela", 14),
                new Person("Jessica", 18)
        );

        // Group by adulthood
        Map<Boolean, List<Person>> groupedByAdulthood = listOfPersons.stream()
                .collect(Collectors.groupingBy(person -> person.age() >= 18));
        System.out.println("Adults: " + groupedByAdulthood.get(true));
        System.out.println("Not yet adults: " + groupedByAdulthood.get(false));

        // Numbers of adults and non adults:
        Map<Boolean, Long> groupedByAdulthoodWithCounter = listOfPersons
                .stream()
                .collect(Collectors.groupingBy(
                        person -> person.age() >= 18,
                        Collectors.counting())
                );
        System.out.println("Adults count: " + groupedByAdulthoodWithCounter.get(true));
        System.out.println("Not yet adults count: " + groupedByAdulthoodWithCounter.get(false));

        // Names of adults and non adults:
        Map<Boolean, List<String>> groupedByAdulthoodWithNames = listOfPersons
                .stream()
                .collect(Collectors.groupingBy(
                        person -> person.age() >= 18,
                        Collectors.mapping(Person::name, Collectors.toList()))
                );
        System.out.println("Adults names: " + groupedByAdulthoodWithNames.get(true));
        System.out.println("Not yet adults names: " + groupedByAdulthoodWithNames.get(false));

        // Names of adults and non adults as TreeSet:
        Map<Boolean, TreeSet<String>> unmodifiableMap = listOfPersons
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
        System.out.println("Adults names (tree set): " + groupedByAdulthoodWithNamesInTreeSet.get(true));
        System.out.println("Not yet adults names (tree set): " + groupedByAdulthoodWithNamesInTreeSet.get(false));


        // Group by age
        Map<Integer, List<Person>> groupedByAge = listOfPersons.stream()
                .collect(Collectors.groupingBy(Person::age));
        System.out.println("People by age: " + groupedByAge);



    }
}
