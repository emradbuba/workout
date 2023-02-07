package com.gitlab.emradbuba.learning.java_examples.java8.mapmerge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMergeDemo {

    public static Map<Integer, Integer> createMergedMap(List<Integer> theList) {
        Map<Integer, Integer> result = new HashMap<>();
        for (Integer i : theList) {
            result.merge(i, 1, (a1, a2) -> a1+a2);
        }
        return result;
    }


}
