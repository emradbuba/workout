package com.emradbuba.learning.workout.codewars.street_fighter;

public class StreetFighter2 {
    private static final int ROW = 0;
    private static final int COL = 1;
    private static final String SPLIT_SYMBOL = ":";

    public static String[] superStreetFighterize(String[][] fighters, int[] position, String[] moves) {
        if (moves.length == 0) {
            return new String[]{};
        }
        int[] currentPosition = position;
        StringBuilder stringBuilder = new StringBuilder();
        for (String move : moves) {
            currentPosition = calcNewPosition(fighters, currentPosition, move);
            stringBuilder.append(fighters[currentPosition[ROW]][currentPosition[COL]]).append(SPLIT_SYMBOL);
        }
        return stringBuilder.toString().split(SPLIT_SYMBOL);
    }

    private static int[] calcNewPosition(String[][] fighters, int[] fromPosition, String move) {
        int numberOfRows = fighters.length;
        int numberOfCols = fighters[0].length;
        return switch (move) {
            case "up" -> {
                int newRow = fromPosition[ROW] > 0 && !(fighters[fromPosition[ROW] - 1][fromPosition[COL]].isEmpty()) ? fromPosition[ROW] - 1 : fromPosition[ROW];
                yield new int[]{newRow, fromPosition[COL]};
            }
            case "down" -> {
                int newRow2 = fromPosition[ROW] < numberOfRows - 1 && !(fighters[fromPosition[ROW] + 1][fromPosition[COL]].isEmpty()) ? fromPosition[ROW] + 1 : fromPosition[ROW];
                yield new int[]{newRow2, fromPosition[COL]};
            }
            case "left" -> {
                int newColumn = fromPosition[COL];
                do {
                    newColumn = (newColumn + numberOfCols - 1) % numberOfCols;
                } while (fighters[fromPosition[ROW]][newColumn].isEmpty());
                yield new int[]{fromPosition[ROW], newColumn};
            }
            case "right" -> {
                int newColumnR = fromPosition[COL];
                do {
                    newColumnR = (newColumnR + 1) % numberOfCols;
                } while (fighters[fromPosition[ROW]][newColumnR].isEmpty());
                yield new int[]{fromPosition[ROW], newColumnR};
            }
            default -> throw new IllegalStateException("Unknown move?");
        };
    }

}
