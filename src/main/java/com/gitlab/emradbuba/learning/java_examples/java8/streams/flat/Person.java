package com.gitlab.emradbuba.learning.java_examples.java8.streams.flat;

import lombok.Builder;
import lombok.Singular;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class Person {
    String name;
    @Singular
    List<String> roles;
}
