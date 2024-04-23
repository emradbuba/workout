package com.emradbuba.learning.workout.codewars.parse_int_reloaded;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReloadedIntParserTest {
    private ReloadedIntParser parser;

    @BeforeEach
    void setUp() {
        parser = new ReloadedIntParser();
    }

    @Test
    void shouldParserReturnCorrectValueForNumber1() {
        String numberToParse = "zero";

        int result = parser.parseInt(numberToParse);

        assertEquals(0, result);
    }

    @Test
    void shouldParserReturnCorrectValueForNumber1CaseInsensitive() {
        String numberToParse = "zErO";

        int result = parser.parseInt(numberToParse);

        assertEquals(0, result);
    }

    @Test
    void shouldParserReturnCorrectValueForNumberOneMilion() {
        String numberToParse = "One Million";

        int result = parser.parseInt(numberToParse);

        assertEquals(1_000_000, result);
    }

    @Test
    void shouldParserReturnCorrectValueFor783919WithoutAnd() {
        String numberToParse = "seven hundred eighty-three thousand nine hundred nineteen";

        int result = parser.parseInt(numberToParse);

        assertEquals(783919, result);
    }

    @Test
    void shouldParserReturnCorrectValueFor783919WithAnd() {
        String numberToParse = "seven hundred and eighty-three thousand and nine hundred and nineteen";

        int result = parser.parseInt(numberToParse);

        assertEquals(783919, result);
    }

    @Test
    void shouldParserReturnCorrectValueFor783919WithLastAnd() {
        String numberToParse = "seven hundred eighty-three thousand nine hundred and nineteen";

        int result = parser.parseInt(numberToParse);

        assertEquals(783919, result);
    }

    @Test
    void shouldParserReturnCorrectValueFor919WithoutAnd() {
        String numberToParse = "nine hundred nineteen";

        int result = parser.parseInt(numberToParse);

        assertEquals(919, result);
    }

    @Test
    void shouldParserReturnCorrectValueFor919WithAnd() {
        String numberToParse = "nine hundred and nineteen";

        int result = parser.parseInt(numberToParse);

        assertEquals(919, result);
    }

    @Test
    void shouldParserReturnCorrectValueFor800() {
        String numberToParse = "eight hundred";

        int result = parser.parseInt(numberToParse);

        assertEquals(800, result);
    }

    @Test
    void shouldParserReturnCorrectValueFor810WithoutAnd() {
        String numberToParse = "eight hundred ten";

        int result = parser.parseInt(numberToParse);

        assertEquals(810, result);
    }

    @Test
    void shouldParserReturnCorrectValueFor801WithAnd() {
        String numberToParse = "eight hundred and one";

        int result = parser.parseInt(numberToParse);

        assertEquals(801, result);
    }

    @Test
    void shouldParserReturnCorrectValueFor801WithoutAnd() {
        String numberToParse = "eight hundred one";

        int result = parser.parseInt(numberToParse);

        assertEquals(801, result);
    }

    @Test
    void shouldParserReturnCorrectValueFor10000WithoutAnd() {
        String numberToParse = "ten thousand";

        int result = parser.parseInt(numberToParse);

        assertEquals(10_000, result);
    }

    @Test
    void shouldParserReturnCorrectValueFor10001WithAnd() {
        String numberToParse = "ten thousand and one";

        int result = parser.parseInt(numberToParse);

        assertEquals(10_001, result);
    }

    @Test
    void shouldParserReturnCorrectValueFor10001WithoutAnd() {
        String numberToParse = "ten thousand one";

        int result = parser.parseInt(numberToParse);

        assertEquals(10_001, result);
    }

    @Test
    void shouldParserReturnCorrectValueForMillion() {
        String numberToParse = "million";

        int result = parser.parseInt(numberToParse);

        assertEquals(1_000_000, result);
    }

    @Test
    void shouldParserReturnCorrectValueForThousand() {
        String numberToParse = "thousand";

        int result = parser.parseInt(numberToParse);

        assertEquals(1_000, result);
    }

    @Test
    void shouldParserReturnCorrectValueForHundred() {
        String numberToParse = "hundred";

        int result = parser.parseInt(numberToParse);

        assertEquals(100, result);
    }
}