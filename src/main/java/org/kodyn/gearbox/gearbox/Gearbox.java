package org.kodyn.gearbox.gearbox;

import org.kodyn.gearbox.external.ExternalSystem;
import org.springframework.stereotype.Service;

@Service
public interface Gearbox {
    void bumpedUpGear();
    void bumpedDownGear();

    void changeMode(GearboxMode mode);
    void changeState(GearboxState state);
    int getCurrentGear();
}
