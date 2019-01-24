package io.github.guit4rfre4k.examples.codewars.dec_to_roman;

import org.junit.Before;
import org.testng.Assert;

public abstract class AbstractRomanConverterTest {

    protected RomanConverter encoder;

    @Before
    public void init() {
        encoder = getEncoder();
    }

    public abstract RomanConverter getEncoder();


    public void testExampleTableBelow1000() {
        Assert.assertEquals(encoder.convert(1), "I");
        Assert.assertEquals(encoder.convert(2), "II");
        Assert.assertEquals(encoder.convert(3), "III");
        Assert.assertEquals(encoder.convert(4), "IV");
        Assert.assertEquals(encoder.convert(5), "V");
        Assert.assertEquals(encoder.convert(6), "VI");
        Assert.assertEquals(encoder.convert(7), "VII");
        Assert.assertEquals(encoder.convert(8), "VIII");
        Assert.assertEquals(encoder.convert(9), "IX");
        Assert.assertEquals(encoder.convert(10), "X");
        Assert.assertEquals(encoder.convert(11), "XI");
        Assert.assertEquals(encoder.convert(12), "XII");
        Assert.assertEquals(encoder.convert(13), "XIII");
        Assert.assertEquals(encoder.convert(14), "XIV");
        Assert.assertEquals(encoder.convert(15), "XV");
        Assert.assertEquals(encoder.convert(16), "XVI");
        Assert.assertEquals(encoder.convert(17), "XVII");
        Assert.assertEquals(encoder.convert(18), "XVIII");
        Assert.assertEquals(encoder.convert(19), "XIX");
        Assert.assertEquals(encoder.convert(20), "XX");
        Assert.assertEquals(encoder.convert(21), "XXI");
        Assert.assertEquals(encoder.convert(22), "XXII");
        Assert.assertEquals(encoder.convert(23), "XXIII");
        Assert.assertEquals(encoder.convert(24), "XXIV");
        Assert.assertEquals(encoder.convert(25), "XXV");
        Assert.assertEquals(encoder.convert(30), "XXX");
        Assert.assertEquals(encoder.convert(35), "XXXV");
        Assert.assertEquals(encoder.convert(40), "XL");
        Assert.assertEquals(encoder.convert(45), "XLV");
        Assert.assertEquals(encoder.convert(46), "XLVI");
        Assert.assertEquals(encoder.convert(48), "XLVIII");
        Assert.assertEquals(encoder.convert(50), "L");
        Assert.assertEquals(encoder.convert(51), "LI");
        Assert.assertEquals(encoder.convert(54), "LIV");
        Assert.assertEquals(encoder.convert(55), "LV");
        Assert.assertEquals(encoder.convert(58), "LVIII");
        Assert.assertEquals(encoder.convert(59), "LIX");
        Assert.assertEquals(encoder.convert(60), "LX");
        Assert.assertEquals(encoder.convert(65), "LXV");
        Assert.assertEquals(encoder.convert(70), "LXX");
        Assert.assertEquals(encoder.convert(74), "LXXIV");
        Assert.assertEquals(encoder.convert(75), "LXXV");
        Assert.assertEquals(encoder.convert(76), "LXXVI");
        Assert.assertEquals(encoder.convert(79), "LXXIX");
        Assert.assertEquals(encoder.convert(80), "LXXX");
        Assert.assertEquals(encoder.convert(81), "LXXXI");
        Assert.assertEquals(encoder.convert(85), "LXXXV");
        Assert.assertEquals(encoder.convert(90), "XC");
        Assert.assertEquals(encoder.convert(91), "XCI");
        Assert.assertEquals(encoder.convert(94), "XCIV");
        Assert.assertEquals(encoder.convert(95), "XCV");
        Assert.assertEquals(encoder.convert(97), "XCVII");
        Assert.assertEquals(encoder.convert(99), "XCIX");
        Assert.assertEquals(encoder.convert(100), "C");
        Assert.assertEquals(encoder.convert(105), "CV");
        Assert.assertEquals(encoder.convert(110), "CX");
        Assert.assertEquals(encoder.convert(115), "CXV");
        Assert.assertEquals(encoder.convert(120), "CXX");
        Assert.assertEquals(encoder.convert(125), "CXXV");
        Assert.assertEquals(encoder.convert(130), "CXXX");
        Assert.assertEquals(encoder.convert(135), "CXXXV");
        Assert.assertEquals(encoder.convert(140), "CXL");
        Assert.assertEquals(encoder.convert(100), "C");
        Assert.assertEquals(encoder.convert(125), "CXXV");
        Assert.assertEquals(encoder.convert(150), "CL");
        Assert.assertEquals(encoder.convert(175), "CLXXV");
        Assert.assertEquals(encoder.convert(200), "CC");
        Assert.assertEquals(encoder.convert(225), "CCXXV");
        Assert.assertEquals(encoder.convert(250), "CCL");
        Assert.assertEquals(encoder.convert(275), "CCLXXV");
        Assert.assertEquals(encoder.convert(300), "CCC");
        Assert.assertEquals(encoder.convert(325), "CCCXXV");
        Assert.assertEquals(encoder.convert(350), "CCCL");
        Assert.assertEquals(encoder.convert(375), "CCCLXXV");
        Assert.assertEquals(encoder.convert(400), "CD");
        Assert.assertEquals(encoder.convert(425), "CDXXV");
        Assert.assertEquals(encoder.convert(450), "CDL");
        Assert.assertEquals(encoder.convert(475), "CDLXXV");
        Assert.assertEquals(encoder.convert(500), "D");
        Assert.assertEquals(encoder.convert(525), "DXXV");
        Assert.assertEquals(encoder.convert(550), "DL");
        Assert.assertEquals(encoder.convert(575), "DLXXV");
        Assert.assertEquals(encoder.convert(600), "DC");
        Assert.assertEquals(encoder.convert(625), "DCXXV");
        Assert.assertEquals(encoder.convert(650), "DCL");
        Assert.assertEquals(encoder.convert(675), "DCLXXV");
        Assert.assertEquals(encoder.convert(700), "DCC");
        Assert.assertEquals(encoder.convert(750), "DCCL");
        Assert.assertEquals(encoder.convert(825), "DCCCXXV");
        Assert.assertEquals(encoder.convert(900), "CM");
        Assert.assertEquals(encoder.convert(975), "CMLXXV");
    }

    public void testGreater1000() {
        Assert.assertEquals(encoder.convert(1000), "M");
        Assert.assertEquals(encoder.convert(1050), "ML");
        Assert.assertEquals(encoder.convert(1125), "MCXXV");
        Assert.assertEquals(encoder.convert(1200), "MCC");
        Assert.assertEquals(encoder.convert(1275), "MCCLXXV");
        Assert.assertEquals(encoder.convert(1350), "MCCCL");
        Assert.assertEquals(encoder.convert(1425), "MCDXXV");
        Assert.assertEquals(encoder.convert(1500), "MD");
        Assert.assertEquals(encoder.convert(1575), "MDLXXV");
        Assert.assertEquals(encoder.convert(1650), "MDCL");
        Assert.assertEquals(encoder.convert(1725), "MDCCXXV");
        Assert.assertEquals(encoder.convert(1800), "MDCCC");
        Assert.assertEquals(encoder.convert(1875), "MDCCCLXXV");
        Assert.assertEquals(encoder.convert(1950), "MCML");
        Assert.assertEquals(encoder.convert(2025), "MMXXV");
        Assert.assertEquals(encoder.convert(2100), "MMC");
        Assert.assertEquals(encoder.convert(2175), "MMCLXXV");
        Assert.assertEquals(encoder.convert(2250), "MMCCL");
        Assert.assertEquals(encoder.convert(2325), "MMCCCXXV");
        Assert.assertEquals(encoder.convert(2400), "MMCD");
        Assert.assertEquals(encoder.convert(2475), "MMCDLXXV");
        Assert.assertEquals(encoder.convert(2550), "MMDL");
        Assert.assertEquals(encoder.convert(3999), "MMMCMXCIX");
    }

    public void testGreaterThan4000() { // Let's asssume that for values greater than 4k, we use MMMM... notation@Test
        Assert.assertEquals(encoder.convert(4000), "MMMM");
        Assert.assertEquals(encoder.convert(4001), "MMMMI");
        Assert.assertEquals(encoder.convert(4001), "MMMMI");
        Assert.assertEquals(encoder.convert(4444), "MMMMCDXLIV");
        Assert.assertEquals(encoder.convert(10000), "MMMMMMMMMM");
    }
}