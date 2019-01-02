package io.github.guit4rfre4k.examples.interviews.bumbum.points;

/**
 * A simple point class used for the purpose of this task.
 */
public class MyPoint {

    private final double x;
    private final double y;
    private int counter;

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
        incrementCounter();
    }

    /**
     * Increments a counter for this point.
     */
    public void incrementCounter() {
        this.counter++;
    }

    @Override
    public String toString() {
        return String.format("(%2.2f, %2.2f) -> counter: %d", x, y, this.counter);
    }
}
