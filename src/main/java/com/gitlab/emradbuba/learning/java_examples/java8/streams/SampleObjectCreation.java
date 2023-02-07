package com.gitlab.emradbuba.learning.java_examples.java8.streams;

import com.gitlab.emradbuba.learning.java_examples.java8.utils.Exam;
import com.gitlab.emradbuba.learning.java_examples.java8.utils.ExamSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class SampleObjectCreation {

    private static List<ExamSession> sessions = new ArrayList<>();
    private static final int NUMBER_OF_SESSIONS = 3;
    private static final int EXAMS_PER_SESSION = 4;

    public static void main(String[] args) {
        //initSessionsWithJava6();
        initSessionsWithJava8();
        listAllExams();
        System.out.println(sessions);
    }

    private static void listAllExams() {
        sessions.stream()
                .flatMap(examSession -> examSession.getExams().stream())
                .forEach(exam -> System.out.println(exam));
    }

    private static void initSessionsWithJava6() {
        for (int i = 0; i < NUMBER_OF_SESSIONS; ++i) {
            ExamSession session = new ExamSession("Session" + (i + 1));
            for (int j = 0; j < EXAMS_PER_SESSION; ++j) {
                String examName = "Exam" + j + " in session " + session.getName();
                int score = new Random().nextInt(100);
                session.addExam(new Exam(examName, score));
            }
            sessions.add(session);
        }
    }

    private static void initSessionsWithJava8() {
        IntStream.range(0, NUMBER_OF_SESSIONS)
                .forEach(i -> sessions.add(
                        new ExamSession("Session" + i))
                );
        sessions.stream().forEach(session -> {
            IntStream.range(0, EXAMS_PER_SESSION)
                    .forEach(i -> session.addExam(
                            new Exam("Exam" + i, 33))
                    );
        });
    }

}
