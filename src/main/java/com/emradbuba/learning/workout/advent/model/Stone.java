package com.emradbuba.learning.workout.advent.model;

import java.math.BigInteger;

public record Stone(BigInteger value) {
    @Override
    public String toString() {
        return String.format("(%s)", value);
    }
}

