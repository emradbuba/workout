package io.github.guit4rfre4k.examples.codewars.duplicate_encoder;

public class FirstDuplicateEncoderTest extends DuplicateEncoderTest {


    @Override
    public DuplicateEncoder getEncoderInstance() {
        return new FirstDuplicateEncoder();
    }
}
