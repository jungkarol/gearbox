package org.kodyn.gearbox.gearbox;

import org.kodyn.gearbox.external.ExternalSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GearboxImpl implements Gearbox {

    @Autowired
    ExternalSystem externalSystem;

    private int maxGear;
    private int currentGear;
    private GearboxState state;
    private GearboxMode mode;
    private boolean dynamicMode;

    public GearboxImpl(@Value("${gearbox.maxGear}") int maxGear,@Value("${gearbox.currentGear}") int currentGear,
                       @Value("${gearbox.state}") GearboxState state, @Value("${gearbox.mode}") GearboxMode mode,
                       @Value("${gearbox.dynamicMode}") boolean dynamicMode) {
        this.maxGear = maxGear;
        this.currentGear = currentGear;
        this.state = state;
        this.mode = mode;
        this.dynamicMode = dynamicMode;
    }

    @Override
    public void bumpedUpGear() {
        if (this.currentGear == this.maxGear) {
            return;
        }
        this.currentGear++;
    }

    @Override
    public void bumpedDownGear() {
        if (this.currentGear == 1) {
            return;
        }
        this.currentGear--;
    }

    @Override
    public int getCurrentGear() {
        return currentGear;
    }
}
