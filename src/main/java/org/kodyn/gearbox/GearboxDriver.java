package org.kodyn.gearbox;

import lombok.AllArgsConstructor;
import org.kodyn.gearbox.gearbox.Gearbox;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GearboxDriver {
    final Gearbox gearbox;

    public void handleGas(Threshold threshold) {
        gearbox.bumpedUpGear();
    }

    public int getCurrentGear() {
        return gearbox.getCurrentGear();
    }
}
