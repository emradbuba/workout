package com.gitlab.emradbuba.learning.java_examples.java8.streams.spliterator.demo1;

public record Person(String firstName, String surname, Integer age) {
    @Override
    public String toString() {
        return String.format("%s %s, %d yo.", this.firstName, this.surname, this.age);
    }
}
