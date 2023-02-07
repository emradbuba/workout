package com.gitlab.emradbuba.learning.java_examples.java8.streams.reduction;

import java.util.stream.Stream;

public class JavaStreamReduceDemo {

    public static void main(String[] args) {
        demoSimpleConcat();
    }

    private static void demoSimpleConcat() {
        String[] words = new String[]{"Alice", "has", "a", "red", "cat"};
        Stream.of(words).reduce((s1, s2) -> s1 + "_" + s2).ifPresent(System.out::println);
    }
}
