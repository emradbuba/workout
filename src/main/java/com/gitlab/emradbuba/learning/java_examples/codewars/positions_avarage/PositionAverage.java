package com.gitlab.emradbuba.learning.java_examples.codewars.positions_avarage;

public class PositionAverage {
    public static double posAverage(final String s) {

        String[] substrings = s.split(", ");
        int n = substrings.length;
        if (n < 2) return 0.0;
        int substringLength = substrings[0].length();
        int numberOfSubsets = n * (n - 1) / 2;
        int numberOfComparisons = numberOfSubsets * substringLength;
        int numberOfEquals = 0;
        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                numberOfEquals += getNumberOfEquals(substrings[i], substrings[j]);
            }
        }
        return ((double) numberOfEquals / (double) numberOfComparisons) * 100.0;
    }

    static int getNumberOfEquals(String s1, String s2) {
        int counter = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                counter++;
            }
        }
        return counter;
    }
}

