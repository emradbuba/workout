package io.github.guit4rfre4k.examples.java8.utils;

import java.util.ArrayList;
import java.util.List;

public class ExamSession {

    private final List<Exam> exams = new ArrayList<>();
    private final String name;

    public ExamSession(String name) {
        this.name = name;
    }

    public List<Exam> getExams() {
        return new ArrayList<>(exams);
    }

    public void addExam(Exam exam) {
        exams.add(exam);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ExamSession{" +
                "exams=" + exams +
                ", name='" + name + '\'' +
                '}' + "\n";
    }
}
