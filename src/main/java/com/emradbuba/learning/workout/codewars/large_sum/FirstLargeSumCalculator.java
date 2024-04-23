package com.emradbuba.learning.workout.codewars.large_sum;

import java.math.BigInteger;

public class FirstLargeSumCalculator implements LargeSumCalculator {

    @Override
    public String firstTenDigitsOfSum(String[] numbers) {
        BigInteger theSum = BigInteger.ZERO;
        for (String s : numbers) {
            theSum.add(new BigInteger(s));
        }
        return theSum.toString().substring(0, 10);
    }
}
