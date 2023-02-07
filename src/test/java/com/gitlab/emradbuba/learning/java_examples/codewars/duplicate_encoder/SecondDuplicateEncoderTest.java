package com.gitlab.emradbuba.learning.java_examples.codewars.duplicate_encoder;

public class SecondDuplicateEncoderTest extends DuplicateEncoderTest{

    @Override
    public DuplicateEncoder getEncoderInstance() {
        return new SecondDuplicateEncoder();
    }
}