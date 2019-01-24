package io.github.guit4rfre4k.examples.codewars.duplicate_encoder;

import java.util.stream.Collectors;

/**
 * Implemetation using streams.
 */
public class SecondDuplicateEncoder implements DuplicateEncoder {

    private static String DUPL_BRACKET = ")";
    private static String NON_DUPL_BRACKET = "(";

    @Override
    public String encode(String word) {
        return word.toLowerCase().chars()
                .mapToLong(i -> word.toLowerCase().chars()
                        .filter(x -> x == i)
                        .count()
                )
                .mapToObj(i -> i > 1 ? DUPL_BRACKET : NON_DUPL_BRACKET)
                .collect(Collectors.joining());
    }
}
