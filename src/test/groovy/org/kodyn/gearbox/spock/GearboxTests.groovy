package org.kodyn.gearbox.spock

import org.kodyn.gearbox.GearboxDriver
import org.kodyn.gearbox.Threshold
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification


class GearboxTests extends Specification {

    GearboxDriver gearboxDriver;

    def setupSpec() {
    }

    def "when handleGas" () {
        given:
            int beforeHandleGas = gearboxDriver.getCurrentGear()
        when:
            gearboxDriver.handleGas(new Threshold(5d))
            int afterHandleGas = gearboxDriver.getCurrentGear()
        than:
            beforeHandleGas >= afterHandleGas
    }
}