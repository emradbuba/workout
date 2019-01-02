package io.github.guit4rfre4k.examples.java8.streams;



import io.github.guit4rfre4k.examples.java8.utils.Person;
import io.github.guit4rfre4k.examples.java8.utils.TestDataProvider;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamsDemo {

    private final static Random rnd = new Random();

    public static void main(String[] args) {
        basicStreamInit();
        sumAndAvgDemo();
        getMaxStringLength();
        soutAllLongerThan(new String[]{"Ala", "Zosia", "John", "Mike", "Miu"}, 3);
        chainOrderDemo();
        supplierDemo();
        collectorListDemo();
        collectorGroupingByDemo();
        collectorStatisticsDemo();
        collectorJoiningDemo();

    }

    private static void basicStreamInit() {
        // Create an empty stream of strings:
        Stream<String> emptyStringStream = Stream.<String>empty();
        emptyStringStream.forEach(s -> System.out.print(" " + s));
        System.out.println();

        // Create a stream of integers 1..10:
        Stream<Integer> integerStream1To10 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integerStream1To10.forEach(theInt -> System.out.print(" " + theInt));
        System.out.println();

        // Concatenation of two streams:
        Stream<Double> doubleStream1To5 = Stream.of(1.0, 2.0, 3.0, 4.0, 5.0);
        Stream<Integer> integerStream1To5 = Stream.of(1, 2, 3, 4, 5);
        Stream<Number> numberStreamConcat = Stream.concat(integerStream1To5, doubleStream1To5); // 1, 2, ..., 1.0, ... 5.0
        numberStreamConcat.forEach(theNumber -> System.out.print(" " + theNumber));
        System.out.println();

        // Generate a RANGE of integers:
        IntStream integerStream30To40 = IntStream.range(30, 40);
        integerStream30To40.forEach(theInt -> System.out.print(" " + theInt));
        System.out.println();

        // Generate a stream of RANDOM integers:
        Stream<Integer> streamOfTenRandomIntegers = Stream.generate(
                () -> rnd.nextInt(50)
        ).limit(10);
        streamOfTenRandomIntegers.forEach(theInt -> System.out.print(" " + theInt));
        System.out.println();

        // Create a stream using a BUILDER:
        Stream.Builder<String> builder = Stream.builder();
        Stream<String> namesStream = builder.add("Radek ")
                .add("Kasia ")
                .add("Adam ")
                .add("Paulina ").build();
        namesStream.forEach(System.out::print);
    }

    private static void sumAndAvgDemo() {
        DoubleStream doubleStream = DoubleStream.of(1f, 2f, 3f, 4f, 5f);
        IntStream intStream = IntStream.generate(() -> rnd.nextInt(100)).limit(5);
        // Count the AVERAGE of doubles:
        System.out.println("Average: " + doubleStream.average().getAsDouble());
        // Count the SUM of integers:
        System.out.println("Sum: " + intStream.sum());
    }

    private static int getMaxStringLength() {
        String[] strings = new String[]{"Ala", "Alicja", "Konstantynopol", "As"};
        IntStream intStream = Arrays.stream(strings).mapToInt(s -> s.length());
        int max = intStream.max().getAsInt();
        System.out.println("The longest word's length: " + max);
        return max;
    }

    private static void soutAllLongerThan(String[] strings, int limit) {
        Arrays.stream(strings).filter(s -> {
            return s.length() > limit;
        }).forEach(s -> {
            String upperCase = s.toUpperCase();
            System.out.print(" " + upperCase);
        });
    }

    private static void chainOrderDemo() {
        String[] stringArray = new String[]{"Ala", "Jacek", "Wiktor", "Kasia", "Adam", "Magda"};
        // Case 1:
        System.out.println("Chain order demo case 1: ");
        Arrays.stream(stringArray)
                .map(s -> {
                    System.out.println("Map: " + s);
                    return s.toLowerCase() + " (" + s.length() + ")";
                })
                .filter(s -> {
                    System.out.println("Filter " + s);
                    return (s.length() - (" (.)".length())) > 4;
                })
                .forEach(s -> System.out.println("Foreach: " + s)
                );
        System.out.println("Chain order demo case 2: ");
        Arrays.stream(stringArray)
                .filter(s -> {
                    System.out.println("Filter " + s);
                    return s.length() > 4;
                })
                .map(s -> {
                    System.out.println("Map: " + s);
                    return s.toLowerCase() + " (" + s.length() + ")";
                })
                .forEach(s -> System.out.println("Foreach: " + s)
                );
    }

    private static void supplierDemo() {
        Supplier<Stream<String>> supplier = new Supplier<Stream<String>>() {
            @Override
            public Stream<String> get() {
                return Stream.<String>of("First", "Second", "Third")
                        .map(s -> s.concat(" " + rnd.nextInt(100)));
            }
        };
        System.out.println("Count 1: " + supplier.get().count());
        System.out.println("Count 2: " + supplier.get().filter(s -> s.startsWith("S")).count());
    }

    private static void collectorListDemo() {
        Stream.of("Ela", "Ula", "Ola", "Ala")
                .sorted((s, t1) -> s.compareTo(t1))
                .collect(Collectors.toList())
                .stream().forEach(s -> System.out.println(s));
    }

    private static void collectorGroupingByDemo() {
        List<Person> employees = TestDataProvider.getSampleEmployeeList();
        employees.stream()
                .collect(Collectors.groupingBy(p -> p.getJobLevel()))
                .forEach((jobLevel, people) -> {
                    List<String> nameSurnameList = people
                            .stream()
                            .map(person -> {
                                return "[" + person.getName() + " " + person.getSurname() + "]";
                            }).collect(Collectors.toList());
                    System.out.println(jobLevel + ": " + nameSurnameList);
                });
    }

    private static void collectorStatisticsDemo() {
        List<Person> employees = TestDataProvider.getSampleEmployeeList();
        IntSummaryStatistics stats = employees
                .stream()
                .collect(Collectors.summarizingInt(p -> p.getAge()));
        System.out.println(stats);
    }

    private static void collectorJoiningDemo() {
        List<Person> employees = TestDataProvider.getSampleEmployeeList();
        String s = employees.stream()
                .map(person -> person.getName())
                .collect(Collectors.joining(
                        ", ",
                        "List of names: ",
                        " and that's all")
                );
        System.out.println(s);
    }


}
