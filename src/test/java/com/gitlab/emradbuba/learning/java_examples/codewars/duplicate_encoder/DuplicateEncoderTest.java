package com.gitlab.emradbuba.learning.java_examples.codewars.duplicate_encoder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class DuplicateEncoderTest {

    private DuplicateEncoder encoder;

    public abstract DuplicateEncoder getEncoderInstance();

    @BeforeEach
    public void setUp(){
        encoder = getEncoderInstance();
    }

    @Test
    public void testEmptyString() {
        assertEquals("", encoder.encode(""));
    }

    @Test
    public void testWithDigits() {
        assertEquals("((())(((", encoder.encode("abc11def"));
        assertEquals("((((((", encoder.encode("123456"));
    }

    @Test
    public void testWithSpecials() {
        assertEquals("(((", encoder.encode("%^&"));
        assertEquals("))))))(", encoder.encode("^^%%$$£"));
    }

    @Test
    public void testBasic() {
        assertEquals("((((((", encoder.encode("abcdef"));
        assertEquals("(", encoder.encode("a"));
        assertEquals("))", encoder.encode("aa"));
        assertEquals("))))))))", encoder.encode("aabbccdd"));
        assertEquals(")()", encoder.encode("ala"));
        assertEquals(")))()()))))()", encoder.encode("oqeirgbqoerfb"));
    }

    @Test
    public void testCapitals() {
        String baseString = "SfGiTvGHbTpHaTiHoTReWnHgJHpUpGjOeEVoIg";
        assertEquals(encoder.encode(baseString), encoder.encode(baseString.toLowerCase()));
        assertEquals(encoder.encode(baseString), encoder.encode(baseString.toUpperCase()));
    }



}