package com.emradbuba.learning.workout.dataconsolidator.matcher.hashing;

@FunctionalInterface
public interface HashCalculator<T> {
    int calculateHash(T element);
}

