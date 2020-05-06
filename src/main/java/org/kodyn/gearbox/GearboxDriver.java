package org.kodyn.gearbox;

import org.kodyn.gearbox.gearbox.Gearbox;
import org.springframework.beans.factory.annotation.Autowired;

public class GearboxDriver {

    private Gearbox gearbox;

    public GearboxDriver(Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    public void handleGas(Threshold threshold) {
        gearbox.bumpedUpGear();
    }
    public int getCurrentGear() {
        return gearbox.getCurrentGear();
    }
}
