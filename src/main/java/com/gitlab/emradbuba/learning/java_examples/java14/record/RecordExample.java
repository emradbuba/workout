package com.gitlab.emradbuba.learning.java_examples.java14.record;

public class RecordExample {
    public static void main(String[] args) {
        DefaultDto defaultAlexMichaelCooper = new DefaultDto(1L, "Alex", "Michael", "cooper", 44);
        System.out.println(defaultAlexMichaelCooper);
        System.out.println(defaultAlexMichaelCooper.introduceMe());

        DefaultDto defaultAlexCooper = new DefaultDto(1L, "Alex", "cooper", 44);
        System.out.println(defaultAlexCooper);

        System.out.println();

        RecordDto recordAlexCooper = new RecordDto(1L, "Alex", "cooper", 44);
        System.out.println(recordAlexCooper);

        RecordDto recordAlexMichealCooper = new RecordDto(1L, "Alex", "Michael", "cooper", 44);
        System.out.println(recordAlexMichealCooper);
        System.out.println(recordAlexMichealCooper.introduceMe());
    }

}
