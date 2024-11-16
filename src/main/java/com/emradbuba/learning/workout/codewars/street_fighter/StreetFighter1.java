package com.emradbuba.learning.workout.codewars.street_fighter;

public class StreetFighter1 {

    private static final int ROW = 0;
    private static final int COL = 1;
    private static final String SPLIT_SYMBOL = ":";

    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves) {
        if (moves.length == 0) {
            return new String[]{};
        }
        int[] currentPosition = position;
        StringBuilder stringBuilder = new StringBuilder();
        for (String move : moves) {
            currentPosition = calcNewPosition(currentPosition, move);
            stringBuilder.append(fighters[currentPosition[ROW]][currentPosition[COL]]).append(SPLIT_SYMBOL);
        }
        return stringBuilder.toString().split(SPLIT_SYMBOL);
    }

    private static int[] calcNewPosition(int[] fromPosition, String move) {
        return switch (move) {
            case "up" -> new int[]{0, fromPosition[COL]};
            case "down" -> new int[]{1, fromPosition[COL]};
            case "left" -> new int[]{fromPosition[ROW], (fromPosition[COL] + 5) % 6};
            case "right" -> new int[]{fromPosition[ROW], (fromPosition[COL] + 1) % 6};
            default -> throw new IllegalStateException("Unknown move?");
        };
    }
}
