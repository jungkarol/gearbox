package org.kodyn.gearbox;

import org.kodyn.gearbox.gearbox.Gearbox;
import org.springframework.beans.factory.annotation.Autowired;

public class GearboxDriver {

    @Autowired
     Gearbox gearbox;

    public void handleGas(Threshold threshold) {
        gearbox.bumpedUpGear();
    }

    public int getCurrentGear() {
        return gearbox.getCurrentGear();
    }
}
