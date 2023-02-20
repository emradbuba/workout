package com.gitlab.emradbuba.learning.java_examples.java8.streams.spliterator;

import com.gitlab.emradbuba.learning.java_examples.java8.streams.spliterator.demo1.Person;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class SpliteratorDemo {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Path path = Path.of(ClassLoader.getSystemResource("person-stream-source.txt").toURI());
        try (Stream<String> stream = Files.lines(path)) {
            Spliterator<String> linesSpliterator = stream.spliterator();
            Spliterator<Person> personSpliterator = new PersonSpliterator(linesSpliterator);
            Stream<Person> streamPerson = StreamSupport.stream(personSpliterator, false);
            streamPerson.forEach(System.out::println);
        }

    }
}
