package org.kodyn.gearbox.gearbox;

public class GearboxConfig {
    int maxGear;
    int currentGear;
    GearboxState state;
    GearboxMode mode;
    boolean dynamicMode;

    public GearboxConfig(int maxGear, int currentGear, GearboxState state, GearboxMode mode, boolean dynamicMode) {
        if(currentGear < 1 || currentGear > maxGear) {
            throw new IllegalArgumentException();
        }
        this.maxGear = maxGear;
        this.currentGear = currentGear;
        this.state = state;
        this.mode = mode;
        this.dynamicMode = dynamicMode;
    }
}
