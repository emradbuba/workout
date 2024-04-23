package com.emradbuba.learning.workout.dataconsolidator.matcher.result;

public record MatchedItem<T>(T item1, T item2) {
    @Override
    public String toString() {
        return "(" + item1 + "|" + item2 + ")";
    }
}