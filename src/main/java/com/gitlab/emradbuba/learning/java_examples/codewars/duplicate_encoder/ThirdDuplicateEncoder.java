package com.gitlab.emradbuba.learning.java_examples.codewars.duplicate_encoder;

/**
 * This implementation uses basic indexOf() String features.
 */
public class ThirdDuplicateEncoder implements DuplicateEncoder {

    @Override
    public String encode(String word) {
        StringBuilder encodedStringBuilder = new StringBuilder();
        word = word.toUpperCase();
        for(char c : word.toCharArray()) {
            char toAppend = word.indexOf(c) == word.lastIndexOf(c) ? '(' : ')';
            encodedStringBuilder.append(toAppend);
        }
        return encodedStringBuilder.toString();
    }
}
