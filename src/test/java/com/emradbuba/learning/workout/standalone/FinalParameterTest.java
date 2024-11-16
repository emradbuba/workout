package com.emradbuba.learning.workout.standalone;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FinalParameterTest {

    private static final Logger LOG = Logger.getLogger(FinalParameterTest.class.getName());
    private static final String MODIFIED_PREFIX = "MOD_";


    @Test
    void testFinalParameter(){
        FinalParameterTest testClass = new FinalParameterTest();
        LOG.info("Creating Radek");
        final Person radek = new Person("Radek", "Em");
        LOG.info("Radek before modification: " + radek);
        testClass.modifyPerson(radek);
        LOG.info("Radek after modification: " + radek);
        assertTrue(radek.toString().contains(MODIFIED_PREFIX));
    }

    @Test
    void testFinalArrayParameter(){
        FinalParameterTest testClass = new FinalParameterTest();
        LOG.info("Creating inital list with one item");
        List<Person> theList = Stream.of(new Person("Radek", "Em")).collect(Collectors.toList());
        assertEquals(1, theList.size());
        testClass.processPersonList(theList);
        assertEquals(3, theList.size());
        LOG.info("List after modification: " + theList);
    }

    private void modifyPerson(final Person person) {
        person.name = MODIFIED_PREFIX.concat(person.name);
        person.surname = MODIFIED_PREFIX.concat(person.surname);
    }

    private void processPersonList(final List<Person> list) {
        list.add(new Person("Extra", "One"));
        list.add(new Person("Extra", "Two"));
    }

    private static class Person {
        private String name;
        private String surname;

        public Person(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
    }
}
