package com.emradbuba.learning.workout.codewars.duplicate_encoder;

import java.util.HashMap;
import java.util.Map;

/**
 * The first fast and stupid implementation...
 */
public class FirstDuplicateEncoder implements DuplicateEncoder {


    @Override
    public String encode(String word) {
        Map<String, Integer> occurenceMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            String s = ("" + word.charAt(i)).toLowerCase();
            occurenceMap.put(s, occurenceMap.containsKey(s) ? occurenceMap.get(s) + 1 : 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            String s = ("" + word.charAt(i)).toLowerCase();
            sb.append(occurenceMap.get(s) > 1 ? ")" : "(");
        }
        return sb.toString();
    }


}
