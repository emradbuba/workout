package io.github.guit4rfre4k.examples.codewars.duplicate_encoder;

import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

public abstract class DuplicateEncoderTest {

    private DuplicateEncoder encoder;

    public abstract DuplicateEncoder getEncoderInstance();

    @Before
    public void setUp(){
        encoder = getEncoderInstance();
    }

    @Test
    public void testEmptyString() {
        Assert.assertEquals("", encoder.encode(""));
    }

    @Test
    public void testWithDigits() {
        Assert.assertEquals("((())(((", encoder.encode("abc11def"));
        Assert.assertEquals("((((((", encoder.encode("123456"));
    }

    @Test
    public void testWithSpecials() {
        Assert.assertEquals("(((", encoder.encode("%^&"));
        Assert.assertEquals("))))))(", encoder.encode("^^%%$$£"));
    }

    @Test
    public void testBasic() {
        Assert.assertEquals("((((((", encoder.encode("abcdef"));
        Assert.assertEquals("(", encoder.encode("a"));
        Assert.assertEquals("))", encoder.encode("aa"));
        Assert.assertEquals("))))))))", encoder.encode("aabbccdd"));
        Assert.assertEquals(")()", encoder.encode("ala"));
        Assert.assertEquals(")))()()))))()", encoder.encode("oqeirgbqoerfb"));
    }

    @Test
    public void testCapitals() {
        String baseString = "SfGiTvGHbTpHaTiHoTReWnHgJHpUpGjOeEVoIg";
        Assert.assertEquals(encoder.encode(baseString), encoder.encode(baseString.toLowerCase()));
        Assert.assertEquals(encoder.encode(baseString), encoder.encode(baseString.toUpperCase()));
    }



}