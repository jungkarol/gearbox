package org.kodyn.gearbox.external;

import java.util.Random;

public class ExternalSystemImpl implements ExternalSystem{
    @Override
    public Rpm getCurrentRpm() {
        return new Rpm(Math.abs(new Random().nextDouble()));
    }
}
