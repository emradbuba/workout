package com.gitlab.emradbuba.learning.java_examples.codewars.large_sum;

/**
 * The first ten digits of the sum of the following one-hundred 50-digit numbers are 5537376230
 * (sum is 5537376230390876637302048746832985971773659831892672) (see Example Test Case).
 * Write a method that returns the first ten digits of the sum of one-hundred random 50-digit
 * numbers you get as String array.
 */
public interface LargeSumCalculator {

    public String firstTenDigitsOfSum(String[] numbers);

}
