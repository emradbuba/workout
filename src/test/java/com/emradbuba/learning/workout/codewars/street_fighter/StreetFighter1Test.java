package com.emradbuba.learning.workout.codewars.street_fighter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StreetFighter1Test {

    private String[][] fighters = new String[][]{
            new String[] { "Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega" },
            new String[] { "Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison" },
    };

    @Test
    void shouldWorkWithNoMoves() {
        String[] solution = new String[]{};
        assertArrayEquals(solution, StreetFighter1.streetFighterSelection(fighters, new int[]{0,0}, new String[]{}));
    }

    @Test
    void shouldWorkWithOnlyOneMove() {
        String[] solution = new String[]{"E.Honda"};
        String[] moves = new String[] { "right"};
        assertArrayEquals(solution, StreetFighter1.streetFighterSelection(fighters, new int[]{0,0}, moves));
    }

    @Test
    void shouldWorkWithFewMoves(){
        String[] moves = new String[] { "up", "left", "right", "left", "left" };
        String[] solution = new String[] { "Ryu", "Vega", "Ryu", "Vega", "Balrog" };
        assertArrayEquals(solution, StreetFighter1.streetFighterSelection(fighters, new int[] {0,0}, moves));
    }

    @Test
    void shouldWorkWhenAlwaysMovingLeft(){
        String[] moves = new String[] { "left", "left", "left", "left", "left", "left", "left", "left" };
        String[] solution = new String[] { "Vega", "Balrog", "Guile", "Blanka", "E.Honda", "Ryu", "Vega", "Balrog" };
        assertArrayEquals(solution, StreetFighter1.streetFighterSelection(fighters, new int[] {0,0}, moves));
    }

    @Test
    void shouldWorkWhenAlwaysMovingRight(){
        String[] moves = new String[] { "right", "right", "right", "right", "right", "right", "right", "right" };
        String[] solution = new String[] { "E.Honda", "Blanka", "Guile", "Balrog", "Vega", "Ryu", "E.Honda", "Blanka" };
        assertArrayEquals(solution, StreetFighter1.streetFighterSelection(fighters, new int[] {0,0}, moves));
    }

    @Test
    void shouldUseAll4DirectionsClockwiseTwice(){
        String[] moves = new String[] { "up", "left", "down", "right", "up", "left", "down", "right" };
        String[] solution = new String[] { "Ryu", "Vega", "M.Bison", "Ken", "Ryu", "Vega", "M.Bison", "Ken" };
        assertArrayEquals(solution, StreetFighter1.streetFighterSelection(fighters, new int[] {0,0}, moves));
    }

    @Test
    void shouldWorkWhenAlwaysMovingDown(){
        String[] moves = new String[] { "down", "down", "down", "down" };
        String[] solution = new String[] { "Ken", "Ken", "Ken", "Ken" };
        assertArrayEquals(solution, StreetFighter1.streetFighterSelection(fighters, new int[] {0,0}, moves));
    }

    @Test
    void shouldWorkWhenAlwaysMovingUp(){
        String[] moves = new String[] { "up", "up", "up", "up" };
        String[] solution = new String[] { "Ryu", "Ryu", "Ryu", "Ryu" };
        assertArrayEquals(solution, StreetFighter1.streetFighterSelection(fighters, new int[] {0,0}, moves));
    }

}