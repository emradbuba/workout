package com.gitlab.emradbuba.learning.java_examples.java8.streams.spliterator;

import com.gitlab.emradbuba.learning.java_examples.java8.streams.spliterator.demo1.Person;

import java.util.Spliterator;
import java.util.function.Consumer;

public class PersonSpliterator implements Spliterator<Person> {
    private final Spliterator<String> linesSpliterator;
    private String tmpFirstName;
    private String tmpSurname;
    private Integer tmpAge;

    public PersonSpliterator(Spliterator<String> linesSpliterator) {
        this.linesSpliterator = linesSpliterator;
    }


    @Override
    public boolean tryAdvance(Consumer<? super Person> action) {
        if (linesSpliterator.tryAdvance(line -> this.tmpFirstName = line)
                && linesSpliterator.tryAdvance(line -> this.tmpSurname = line)
                && linesSpliterator.tryAdvance(line -> this.tmpAge = Integer.parseInt(line))) {
            Person person = new Person(this.tmpFirstName, this.tmpSurname, this.tmpAge);
            action.accept(person);
            return true;
        }
        return false;
    }

    @Override
    public Spliterator<Person> trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        return 0;
    }

    @Override
    public int characteristics() {
        return 0;
    }
}
