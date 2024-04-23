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
        assertEquals(encoder.convert(1), "I");
        assertEquals(encoder.convert(2), "II");
        assertEquals(encoder.convert(3), "III");
        assertEquals(encoder.convert(4), "IV");
        assertEquals(encoder.convert(5), "V");
        assertEquals(encoder.convert(6), "VI");
        assertEquals(encoder.convert(7), "VII");
        assertEquals(encoder.convert(8), "VIII");
        assertEquals(encoder.convert(9), "IX");
        assertEquals(encoder.convert(10), "X");
        assertEquals(encoder.convert(11), "XI");
        assertEquals(encoder.convert(12), "XII");
        assertEquals(encoder.convert(13), "XIII");
        assertEquals(encoder.convert(14), "XIV");
        assertEquals(encoder.convert(15), "XV");
        assertEquals(encoder.convert(16), "XVI");
        assertEquals(encoder.convert(17), "XVII");
        assertEquals(encoder.convert(18), "XVIII");
        assertEquals(encoder.convert(19), "XIX");
        assertEquals(encoder.convert(20), "XX");
        assertEquals(encoder.convert(21), "XXI");
        assertEquals(encoder.convert(22), "XXII");
        assertEquals(encoder.convert(23), "XXIII");
        assertEquals(encoder.convert(24), "XXIV");
        assertEquals(encoder.convert(25), "XXV");
        assertEquals(encoder.convert(30), "XXX");
        assertEquals(encoder.convert(35), "XXXV");
        assertEquals(encoder.convert(40), "XL");
        assertEquals(encoder.convert(45), "XLV");
        assertEquals(encoder.convert(46), "XLVI");
        assertEquals(encoder.convert(48), "XLVIII");
        assertEquals(encoder.convert(50), "L");
        assertEquals(encoder.convert(51), "LI");
        assertEquals(encoder.convert(54), "LIV");
        assertEquals(encoder.convert(55), "LV");
        assertEquals(encoder.convert(58), "LVIII");
        assertEquals(encoder.convert(59), "LIX");
        assertEquals(encoder.convert(60), "LX");
        assertEquals(encoder.convert(65), "LXV");
        assertEquals(encoder.convert(70), "LXX");
        assertEquals(encoder.convert(74), "LXXIV");
        assertEquals(encoder.convert(75), "LXXV");
        assertEquals(encoder.convert(76), "LXXVI");
        assertEquals(encoder.convert(79), "LXXIX");
        assertEquals(encoder.convert(80), "LXXX");
        assertEquals(encoder.convert(81), "LXXXI");
        assertEquals(encoder.convert(85), "LXXXV");
        assertEquals(encoder.convert(90), "XC");
        assertEquals(encoder.convert(91), "XCI");
        assertEquals(encoder.convert(94), "XCIV");
        assertEquals(encoder.convert(95), "XCV");
        assertEquals(encoder.convert(97), "XCVII");
        assertEquals(encoder.convert(99), "XCIX");
        assertEquals(encoder.convert(100), "C");
        assertEquals(encoder.convert(105), "CV");
        assertEquals(encoder.convert(110), "CX");
        assertEquals(encoder.convert(115), "CXV");
        assertEquals(encoder.convert(120), "CXX");
        assertEquals(encoder.convert(125), "CXXV");
        assertEquals(encoder.convert(130), "CXXX");
        assertEquals(encoder.convert(135), "CXXXV");
        assertEquals(encoder.convert(140), "CXL");
        assertEquals(encoder.convert(100), "C");
        assertEquals(encoder.convert(125), "CXXV");
        assertEquals(encoder.convert(150), "CL");
        assertEquals(encoder.convert(175), "CLXXV");
        assertEquals(encoder.convert(200), "CC");
        assertEquals(encoder.convert(225), "CCXXV");
        assertEquals(encoder.convert(250), "CCL");
        assertEquals(encoder.convert(275), "CCLXXV");
        assertEquals(encoder.convert(300), "CCC");
        assertEquals(encoder.convert(325), "CCCXXV");
        assertEquals(encoder.convert(350), "CCCL");
        assertEquals(encoder.convert(375), "CCCLXXV");
        assertEquals(encoder.convert(400), "CD");
        assertEquals(encoder.convert(425), "CDXXV");
        assertEquals(encoder.convert(450), "CDL");
        assertEquals(encoder.convert(475), "CDLXXV");
        assertEquals(encoder.convert(500), "D");
        assertEquals(encoder.convert(525), "DXXV");
        assertEquals(encoder.convert(550), "DL");
        assertEquals(encoder.convert(575), "DLXXV");
        assertEquals(encoder.convert(600), "DC");
        assertEquals(encoder.convert(625), "DCXXV");
        assertEquals(encoder.convert(650), "DCL");
        assertEquals(encoder.convert(675), "DCLXXV");
        assertEquals(encoder.convert(700), "DCC");
        assertEquals(encoder.convert(750), "DCCL");
        assertEquals(encoder.convert(825), "DCCCXXV");
        assertEquals(encoder.convert(900), "CM");
        assertEquals(encoder.convert(975), "CMLXXV");
    }

    public void testGreater1000() {
        assertEquals(encoder.convert(1000), "M");
        assertEquals(encoder.convert(1050), "ML");
        assertEquals(encoder.convert(1125), "MCXXV");
        assertEquals(encoder.convert(1200), "MCC");
        assertEquals(encoder.convert(1275), "MCCLXXV");
        assertEquals(encoder.convert(1350), "MCCCL");
        assertEquals(encoder.convert(1425), "MCDXXV");
        assertEquals(encoder.convert(1500), "MD");
        assertEquals(encoder.convert(1575), "MDLXXV");
        assertEquals(encoder.convert(1650), "MDCL");
        assertEquals(encoder.convert(1725), "MDCCXXV");
        assertEquals(encoder.convert(1800), "MDCCC");
        assertEquals(encoder.convert(1875), "MDCCCLXXV");
        assertEquals(encoder.convert(1950), "MCML");
        assertEquals(encoder.convert(2025), "MMXXV");
        assertEquals(encoder.convert(2100), "MMC");
        assertEquals(encoder.convert(2175), "MMCLXXV");
        assertEquals(encoder.convert(2250), "MMCCL");
        assertEquals(encoder.convert(2325), "MMCCCXXV");
        assertEquals(encoder.convert(2400), "MMCD");
        assertEquals(encoder.convert(2475), "MMCDLXXV");
        assertEquals(encoder.convert(2550), "MMDL");
        assertEquals(encoder.convert(3999), "MMMCMXCIX");
    }

    public void testGreaterThan4000() { // Let's asssume that for values greater than 4k, we use MMMM... notation@Test
        assertEquals(encoder.convert(4000), "MMMM");
        assertEquals(encoder.convert(4001), "MMMMI");
        assertEquals(encoder.convert(4001), "MMMMI");
        assertEquals(encoder.convert(4444), "MMMMCDXLIV");
        assertEquals(encoder.convert(10000), "MMMMMMMMMM");
    }
}