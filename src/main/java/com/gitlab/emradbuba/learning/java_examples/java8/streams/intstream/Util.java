package com.gitlab.emradbuba.learning.java_examples.java8.streams.intstream;

import java.util.List;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

final class Util {
    private static final Random rand = new Random();

    static List<JobCandidate> generateCandidates(int limit){
        return IntStream
                .generate(() -> 0)
                .limit(limit)
                .mapToObj(i -> generateCandidate())
                .toList();
    }

    static JobCandidate generateCandidate(){
        return new JobCandidate(
                rand.nextInt(60),
                rand.nextBoolean(),
                rand.nextBoolean()
        );
    }
}
