package com.gitlab.emradbuba.learning.java_examples.java8.streams.collect_imdb;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Movie {
    private final String title;
    private final int releaseYear;
    private Set<Actor> actors = new HashSet<>();

    public void addActor(Actor actor) {
        this.actors.add(actor);
    }
}
