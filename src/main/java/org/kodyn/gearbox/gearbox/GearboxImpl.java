package org.kodyn.gearbox.gearbox;

import org.kodyn.gearbox.external.ExternalSystem;
import org.springframework.beans.factory.annotation.Autowired;

public class GearboxImpl implements Gearbox{

    GearboxConfig gearboxConfig;

    public GearboxImpl(GearboxConfig gearboxConfig) {
        this.gearboxConfig = gearboxConfig;
    }

    @Autowired
    ExternalSystem externalSystem;

    @Override
    public void bumpedUpGear() {
        if(gearboxConfig.getCurrentGear() == gearboxConfig.getMaxGear()) {
            return;
        }
        gearboxConfig = new GearboxConfig(gearboxConfig.getMaxGear(), gearboxConfig.getCurrentGear() + 1, gearboxConfig.getState(), gearboxConfig.getMode(), gearboxConfig.isDynamicMode());
    }

    @Override
    public void bumpedDownGear() {
        if(gearboxConfig.getCurrentGear() == 1) {
            return;
        }
        gearboxConfig = new GearboxConfig(gearboxConfig.getMaxGear(), gearboxConfig.getCurrentGear() - 1, gearboxConfig.getState(), gearboxConfig.getMode(), gearboxConfig.isDynamicMode());

    }

    @Override
    public void changeMode(GearboxMode mode) {
        gearboxConfig = new GearboxConfig(gearboxConfig.getMaxGear(), gearboxConfig.getCurrentGear(), gearboxConfig.getState(), mode, gearboxConfig.isDynamicMode());
    }

    @Override
    public void changeState(GearboxState state) {
        gearboxConfig = new GearboxConfig(gearboxConfig.getMaxGear(), gearboxConfig.getCurrentGear(), state, gearboxConfig.getMode(), gearboxConfig.isDynamicMode());
    }

    @Override
    public int getCurrentGear() {
        return gearboxConfig.getCurrentGear();
    }
}
