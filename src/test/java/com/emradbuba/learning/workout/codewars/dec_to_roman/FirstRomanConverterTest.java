package com.emradbuba.learning.workout.codewars.dec_to_roman;

import org.junit.jupiter.api.Test;

public class FirstRomanConverterTest extends AbstractRomanConverterTest {

    @Override
    public RomanConverter getEncoder() {
        return new FirstConverter();
    }

    @Override
    @Test
    public void testExampleTableBelow1000() {
        super.testExampleTableBelow1000();
    }

    @Override
    @Test
    public void testGreater1000() {
        super.testGreater1000();
    }

    @Override
    @Test
    public void testGreaterThan4000() { // Let's asssume that for values greater than 4k, we use MMMM... notation@Test
        super.testGreaterThan4000();
    }

}
