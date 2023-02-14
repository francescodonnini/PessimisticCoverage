package io.francescodonnini;

public class Adder {
    private double accumulator;

    public Adder(double initialValue) {
        accumulator = initialValue;
    }

    public void add(double i) {
        accumulator += i;
    }

    public double getResult() {
        return accumulator;
    }
}
