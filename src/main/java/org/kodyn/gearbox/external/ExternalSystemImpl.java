package org.kodyn.gearbox.external;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ExternalSystemImpl implements ExternalSystem{
    @Override
    public Rpm getCurrentRpm() {
        return new Rpm(Math.abs(new Random().nextDouble()));
    }
}
