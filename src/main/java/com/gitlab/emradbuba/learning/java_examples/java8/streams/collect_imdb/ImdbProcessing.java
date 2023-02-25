package com.gitlab.emradbuba.learning.java_examples.java8.streams.collect_imdb;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImdbProcessing {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Set<Movie> moviesFromFile = createMoviesFromFile();
        countActors(moviesFromFile);
        whichActorPlaysMostOften(moviesFromFile);
        whichActorPlaysMostOftenDuringOneYear(moviesFromFile);
    }

    private static void whichActorPlaysMostOftenDuringOneYear(Set<Movie> moviesFromFile) {
        // TODO
    }

    private static void whichActorPlaysMostOften(Set<Movie> moviesFromFile) {
        Actor actor = moviesFromFile.stream()
                .flatMap(movie -> movie.getActors().stream())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElseThrow();

        System.out.println("Actor in the most number of movies: " + actor);
    }

    private static void countActors(Set<Movie> moviesFromFile) {
        long numberOfActors = moviesFromFile.stream()
                .flatMap(movie -> movie.getActors().stream())
                .distinct()
                .count();
        System.out.println("Number of actors: " + numberOfActors);
    }

    private static Set<Movie> createMoviesFromFile() throws URISyntaxException, IOException {
        Set<Movie> movies = new HashSet<>();
        Path path = Path.of(ClassLoader.getSystemResource("movies-mpaa.txt").toURI());
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(
                    (String line) -> {
                        String[] elements = line.split("/");
                        String title =
                                elements[0].substring(0, elements[0].lastIndexOf("(")).trim();
                        String releaseYear =
                                elements[0].substring(elements[0].lastIndexOf("(") + 1, elements[0].lastIndexOf(")"));

                        if (releaseYear.contains(",")) {
                            // with skip movies with a coma in their title
                            return;
                        }

                        Movie movie = new Movie(title, Integer.valueOf(releaseYear));

                        for (int i = 1; i < elements.length; i++) {
                            String[] name = elements[i].split(", ");
                            String lastName = name[0].trim();
                            String firstName = "";
                            if (name.length > 1) {
                                firstName = name[1].trim();
                            }

                            Actor actor = new Actor(lastName, firstName);
                            movie.addActor(actor);
                        }

                        movies.add(movie);
                    }
            );

            System.out.println("# movies = " + movies.size());
            return movies;
        }
    }
}
