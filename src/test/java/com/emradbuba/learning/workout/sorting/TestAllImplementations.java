package com.emradbuba.learning.workout.sorting;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@ParameterizedTest(name = "{0}")
@MethodSource("allImplementations")
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAllImplementations {
}
