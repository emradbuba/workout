package com.gitlab.emradbuba.learning.java_examples.java8.streams.intstream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class IntStreamDemo {
    private static final int POINTS_FOR_DRIVING_LICENSE = 5;
    private static final int POINTS_FOR_RELOCATION_READINESS = 10;

    public static void main(String[] args) {
        List<JobCandidate> jobCandidates = Util.generateCandidates(1);

        // Find candidate with at least 5y exp and highest score...
        JobCandidate bestJobCandidate = jobCandidates.stream()
                .filter(jobCandidate -> jobCandidate.yearsOfExperience() >= 5)
                .max(Comparator.comparing(candidateToScoreFunction))
                .orElseThrow(() -> new IllegalStateException("Ups..."));
        System.out.println("Best job candidate: " + bestJobCandidate);

        // Statistics...
        IntSummaryStatistics scoreSummaryStatistics = jobCandidates.stream()
                .filter(jobCandidate -> jobCandidate.yearsOfExperience() >= 5)
                .mapToInt(candidateToScoreToIntFunction)
                .summaryStatistics();

        System.out.println("Score statistics: " + scoreSummaryStatistics);

    }

    // Just for demo - the is a specific To[Int|Double|Long]Function apart from just function
    private static final Function<JobCandidate, Integer> candidateToScoreFunction = IntStreamDemo::calculateScore;

    private static final ToIntFunction<JobCandidate> candidateToScoreToIntFunction = IntStreamDemo::calculateScore;

    private static int calculateScore(JobCandidate value) {
        return value.yearsOfExperience() / 10
                + (value.hasDrivingLicense() ? POINTS_FOR_DRIVING_LICENSE : 0)
                + (value.readyForRelocation() ? POINTS_FOR_RELOCATION_READINESS : 0);
    }

}
