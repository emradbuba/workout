package io.github.guit4rfre4k.examples.codewars.duplicate_encoder;

public interface DuplicateEncoder {

    /**
     * Convert a string to a new string where each character
     * in the new string is '(' if that character appears only once in the original string,
     * or ')' if that character appears more than once in the original string.
     * Ignore capitalization when determining if a character is a duplicate.
     * @param word
     * @return
     */
    public String encode(String word);
}
