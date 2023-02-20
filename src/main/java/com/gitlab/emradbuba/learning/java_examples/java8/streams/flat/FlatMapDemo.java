package com.gitlab.emradbuba.learning.java_examples.java8.streams.flat;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {
    public static void main(String[] args) throws URISyntaxException, IOException {
        Person person1 = Person.builder()
                .name("Steven")
                .role("admin/read")
                .role("admin/write")
                .role("user/read")
                .role("user/write")
                .build();
        Person person2 = Person.builder()
                .name("Anna")
                .role("user/read")
                .role("user/write")
                .build();
        Person person3 = Person.builder()
                .name("Josef")
                .role("user/read")
                .role("user/write")
                .role("admin/read")
                .build();
        Person person4 = Person.builder()
                .name("Maria")
                .role("user/read")
                .role("user/write")
                .role("admin/read")
                .role("admin/write")
                .build();
        Stream<Person> personStream1 = Stream.of(person1, person2);
        Stream<Person> personStream2 = Stream.of(person3, person4);


        long numberOfAssignedAdminRoles =
                Stream.of(personStream1, personStream2)
                        .flatMap(Function.identity())
                        .flatMap(person -> person.getRoles().stream())
                        .flatMap(role -> Stream.of(role.split("/")))
                        .filter("admin"::equals)
                        .count();
        System.out.println("Number of admin roles: " + numberOfAssignedAdminRoles);
    }
}
