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
        if(gearboxConfig.currentGear == gearboxConfig.maxGear) {
            return;
        }
        gearboxConfig = new GearboxConfig(gearboxConfig.maxGear, gearboxConfig.currentGear + 1, gearboxConfig.state, gearboxConfig.mode, gearboxConfig.dynamicMode);
    }

    @Override
    public void bumpedDownGear() {
        if(gearboxConfig.currentGear == 1) {
            return;
        }
        gearboxConfig = new GearboxConfig(gearboxConfig.maxGear, gearboxConfig.currentGear - 1, gearboxConfig.state, gearboxConfig.mode, gearboxConfig.dynamicMode);

    }

    @Override
    public void changeMode(GearboxMode mode) {
        gearboxConfig = new GearboxConfig(gearboxConfig.maxGear, gearboxConfig.currentGear, gearboxConfig.state, mode, gearboxConfig.dynamicMode);
    }

    @Override
    public void changeState(GearboxState state) {
        gearboxConfig = new GearboxConfig(gearboxConfig.maxGear, gearboxConfig.currentGear, state, gearboxConfig.mode, gearboxConfig.dynamicMode);
    }

    @Override
    public int getCurrentGear() {
        return gearboxConfig.currentGear;
    }
}
