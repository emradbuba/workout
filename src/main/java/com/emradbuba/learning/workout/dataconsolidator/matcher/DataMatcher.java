package com.emradbuba.learning.workout.dataconsolidator.matcher;

import com.emradbuba.learning.workout.dataconsolidator.matcher.result.MatchingResult;

import java.util.List;

public interface DataMatcher<T> {
    MatchingResult<T> performMatching(List<T> listA, List<T> listB);
}
