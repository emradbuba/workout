package com.emradbuba.learning.workout.leetcode.reorderlist_143;

import com.emradbuba.learning.workout.leetcode.TestAllImplementations;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReorderListSolutionTest {

    @TestAllImplementations
    void should(String solutionName, ReorderListSolution solution) {

    }

    static Stream<Arguments> allImplementations() {
        return Stream.of(Arguments.of("FirstSolution", new ReorderListFirstSolution()));
    }
}