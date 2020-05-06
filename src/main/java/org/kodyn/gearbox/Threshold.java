package org.kodyn.gearbox;

public class Threshold {
    private final double threshold;

    public Threshold(double threshold) {
        if(threshold < 0 || threshold > 100) {
            throw new IllegalArgumentException();
        }
        this.threshold = threshold;
    }
}
