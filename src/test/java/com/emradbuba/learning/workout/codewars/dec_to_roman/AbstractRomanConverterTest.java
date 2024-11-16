package com.emradbuba.learning.workout.codewars.dec_to_roman;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class AbstractRomanConverterTest {

    protected RomanConverter encoder;

    @BeforeEach
    public void init() {
        encoder = getEncoder();
    }

    public abstract RomanConverter getEncoder();


    public void testExampleTableBelow1000() {
        assertEquals("I", encoder.convert(1));
        assertEquals("II", encoder.convert(2));
        assertEquals("III", encoder.convert(3));
        assertEquals("IV", encoder.convert(4));
        assertEquals("V", encoder.convert(5));
        assertEquals("VI", encoder.convert(6));
        assertEquals("VII", encoder.convert(7));
        assertEquals("VIII", encoder.convert(8));
        assertEquals("IX", encoder.convert(9));
        assertEquals("X", encoder.convert(10));
        assertEquals("XI", encoder.convert(11));
        assertEquals("XII", encoder.convert(12));
        assertEquals("XIII", encoder.convert(13));
        assertEquals("XIV", encoder.convert(14));
        assertEquals("XV", encoder.convert(15));
        assertEquals("XVI", encoder.convert(16));
        assertEquals("XVII", encoder.convert(17));
        assertEquals("XVIII", encoder.convert(18));
        assertEquals("XIX", encoder.convert(19));
        assertEquals("XX", encoder.convert(20));
        assertEquals("XXI", encoder.convert(21));
        assertEquals("XXII", encoder.convert(22));
        assertEquals("XXIII", encoder.convert(23));
        assertEquals("XXIV", encoder.convert(24));
        assertEquals("XXV", encoder.convert(25));
        assertEquals("XXX", encoder.convert(30));
        assertEquals("XXXV", encoder.convert(35));
        assertEquals("XL", encoder.convert(40));
        assertEquals("XLV", encoder.convert(45));
        assertEquals("XLVI", encoder.convert(46));
        assertEquals("XLVIII", encoder.convert(48));
        assertEquals("L", encoder.convert(50));
        assertEquals("LI", encoder.convert(51));
        assertEquals("LIV", encoder.convert(54));
        assertEquals("LV", encoder.convert(55));
        assertEquals("LVIII", encoder.convert(58));
        assertEquals("LIX", encoder.convert(59));
        assertEquals("LX", encoder.convert(60));
        assertEquals("LXV", encoder.convert(65));
        assertEquals("LXX", encoder.convert(70));
        assertEquals("LXXIV", encoder.convert(74));
        assertEquals("LXXV", encoder.convert(75));
        assertEquals("LXXVI", encoder.convert(76));
        assertEquals("LXXIX", encoder.convert(79));
        assertEquals("LXXX", encoder.convert(80));
        assertEquals("LXXXI", encoder.convert(81));
        assertEquals("LXXXV", encoder.convert(85));
        assertEquals("XC", encoder.convert(90));
        assertEquals("XCI", encoder.convert(91));
        assertEquals("XCIV", encoder.convert(94));
        assertEquals("XCV", encoder.convert(95));
        assertEquals("XCVII", encoder.convert(97));
        assertEquals("XCIX", encoder.convert(99));
        assertEquals( "C", encoder.convert(100));
        assertEquals( "CV", encoder.convert(105));
        assertEquals( "CX", encoder.convert(110));
        assertEquals( "CXV", encoder.convert(115));
        assertEquals( "CXX", encoder.convert(120));
        assertEquals( "CXXV", encoder.convert(125));
        assertEquals( "CXXX", encoder.convert(130));
        assertEquals( "CXXXV", encoder.convert(135));
        assertEquals( "CXL", encoder.convert(140));
        assertEquals( "C", encoder.convert(100));
        assertEquals( "CXXV", encoder.convert(125));
        assertEquals( "CL", encoder.convert(150));
        assertEquals( "CLXXV", encoder.convert(175));
        assertEquals( "CC", encoder.convert(200));
        assertEquals( "CCXXV", encoder.convert(225));
        assertEquals( "CCL", encoder.convert(250));
        assertEquals( "CCLXXV", encoder.convert(275));
        assertEquals( "CCC", encoder.convert(300));
        assertEquals( "CCCXXV", encoder.convert(325));
        assertEquals( "CCCL", encoder.convert(350));
        assertEquals( "CCCLXXV", encoder.convert(375));
        assertEquals( "CD", encoder.convert(400));
        assertEquals( "CDXXV", encoder.convert(425));
        assertEquals( "CDL", encoder.convert(450));
        assertEquals( "CDLXXV", encoder.convert(475));
        assertEquals( "D", encoder.convert(500));
        assertEquals( "DXXV", encoder.convert(525));
        assertEquals( "DL", encoder.convert(550));
        assertEquals( "DLXXV", encoder.convert(575));
        assertEquals( "DC", encoder.convert(600));
        assertEquals( "DCXXV", encoder.convert(625));
        assertEquals( "DCL", encoder.convert(650));
        assertEquals( "DCLXXV", encoder.convert(675));
        assertEquals( "DCC", encoder.convert(700));
        assertEquals( "DCCL", encoder.convert(750));
        assertEquals( "DCCCXXV", encoder.convert(825));
        assertEquals( "CM", encoder.convert(900));
        assertEquals( "CMLXXV", encoder.convert(975));
    }

    public void testGreater1000() {
        assertEquals("M", encoder.convert(1000));
        assertEquals("ML", encoder.convert(1050));
        assertEquals("MCXXV", encoder.convert(1125));
        assertEquals("MCC", encoder.convert(1200));
        assertEquals("MCCLXXV", encoder.convert(1275));
        assertEquals("MCCCL", encoder.convert(1350));
        assertEquals("MCDXXV", encoder.convert(1425));
        assertEquals("MD", encoder.convert(1500));
        assertEquals("MDLXXV", encoder.convert(1575));
        assertEquals("MDCL", encoder.convert(1650));
        assertEquals("MDCCXXV", encoder.convert(1725));
        assertEquals("MDCCC", encoder.convert(1800));
        assertEquals("MDCCCLXXV", encoder.convert(1875));
        assertEquals("MCML", encoder.convert(1950));
        assertEquals("MMXXV", encoder.convert(2025));
        assertEquals("MMC", encoder.convert(2100));
        assertEquals("MMCLXXV", encoder.convert(2175));
        assertEquals("MMCCL", encoder.convert(2250));
        assertEquals("MMCCCXXV", encoder.convert(2325));
        assertEquals("MMCD", encoder.convert(2400));
        assertEquals("MMCDLXXV", encoder.convert(2475));
        assertEquals("MMDL", encoder.convert(2550));
        assertEquals("MMMCMXCIX", encoder.convert(3999));
    }

    public void testGreaterThan4000() { // Let's asssume that for values greater than 4k, we use MMMM... notation@Test
        assertEquals("MMMM", encoder.convert(4000));
        assertEquals("MMMMI", encoder.convert(4001));
        assertEquals("MMMMI", encoder.convert(4001));
        assertEquals("MMMMCDXLIV", encoder.convert(4444));
        assertEquals("MMMMMMMMMM", encoder.convert(10000));
    }
}