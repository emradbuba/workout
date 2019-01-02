package io.github.guit4rfre4k.examples.java8.utils;

public class Exam {

    private final String examName;
    private final int examScore;

    public String getExamName() {
        return examName;
    }

    public int getExamScore() {
        return examScore;
    }

    public Exam(String examName, int examScore) {

        this.examName = examName;
        this.examScore = examScore;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examName='" + examName + '\'' +
                ", examScore=" + examScore +
                '}';
    }
}
