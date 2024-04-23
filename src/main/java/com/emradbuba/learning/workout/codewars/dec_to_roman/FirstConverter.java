package com.emradbuba.learning.workout.codewars.dec_to_roman;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FirstConverter implements RomanConverter {

    private final Map<Integer, String> basicNumbers = new HashMap<>();

    public FirstConverter() {

        basicNumbers.put(1, "I");
        basicNumbers.put(2, "II");
        basicNumbers.put(3, "III");
        basicNumbers.put(4, "IV");
        basicNumbers.put(5, "V");
        basicNumbers.put(6, "VI");
        basicNumbers.put(7, "VII");
        basicNumbers.put(8, "VIII");
        basicNumbers.put(9, "IX");
        basicNumbers.put(10, "X");
        basicNumbers.put(20, "XX");
        basicNumbers.put(30, "XXX");
        basicNumbers.put(40, "XL");
        basicNumbers.put(50, "L");
        basicNumbers.put(60, "LX");
        basicNumbers.put(70, "LXX");
        basicNumbers.put(80, "LXXX");
        basicNumbers.put(90, "XC");
        basicNumbers.put(100, "C");
        basicNumbers.put(200, "CC");
        basicNumbers.put(300, "CCC");
        basicNumbers.put(400, "CD");
        basicNumbers.put(500, "D");
        basicNumbers.put(600, "DC");
        basicNumbers.put(700, "DCC");
        basicNumbers.put(800, "DCCC");
        basicNumbers.put(900, "CM");
        basicNumbers.put(1000, "M");
    }

    private String getBasicNumber(int number) {
        if(number > 1000) {
            return String.join("", Collections.nCopies(number / 1000, "M"));
        }
        return basicNumbers.get(number);
    }


    @Override
    public String convert(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Only positive number can be converted");
        }
        StringBuilder builder = new StringBuilder();
        for (int division : new int[]{1000, 100, 10, 1}) {
            if (n < division) continue;
            int howMany = n / division;
            builder.append(getBasicNumber(howMany * division));
            n -= division * howMany;
        }

        return builder.toString();
    }
}
