package com.emradbuba.learning.workout.codewars.dec_to_roman;

import java.util.TreeMap;

public class SecondConverter implements RomanConverter {

    private final TreeMap<Integer, String> basicNumbers = new TreeMap<>();

    public SecondConverter() {
        basicNumbers.put(0, "");
        basicNumbers.put(1, "I");
        basicNumbers.put(4, "IV");
        basicNumbers.put(5, "V");
        basicNumbers.put(9, "IX");
        basicNumbers.put(10, "X");
        basicNumbers.put(40, "XL");
        basicNumbers.put(50, "L");
        basicNumbers.put(90, "XC");
        basicNumbers.put(100, "C");
        basicNumbers.put(400, "CD");
        basicNumbers.put(500, "D");
        basicNumbers.put(900, "CM");
        basicNumbers.put(1000, "M");
    }

    @Override
    public String convert(int n) {
        StringBuilder builder = new StringBuilder();
        Integer floorKey = basicNumbers.floorKey(n);
        if (floorKey > 0) {
            builder.append(basicNumbers.get(floorKey) + convert(n - floorKey));
        }
        return builder.toString();
    }
}
