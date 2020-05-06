package org.kodyn.gearbox.gearbox;

public interface Gearbox {
    void bumpedUpGear();

    void bumpedDownGear();

    void changeMode(GearboxMode mode);

    void changeState(GearboxState state);

    int getCurrentGear();
}
