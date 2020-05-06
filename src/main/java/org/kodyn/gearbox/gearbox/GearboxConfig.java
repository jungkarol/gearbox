package org.kodyn.gearbox.gearbox;

import lombok.Getter;

public class GearboxConfig {
    @Getter private final int maxGear;
    @Getter private final int currentGear;
    @Getter private final GearboxState state;
    @Getter private final GearboxMode mode;
    @Getter private final boolean dynamicMode;

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
