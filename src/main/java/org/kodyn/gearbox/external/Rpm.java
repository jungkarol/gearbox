package org.kodyn.gearbox.external;

public class Rpm {
    private final double rpm;

    public Rpm(double rpm) {
        if(rpm < 0) {
            throw new IllegalArgumentException();
        }
        this.rpm = rpm;
    }
}
