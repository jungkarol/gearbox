package org.kodyn.gearbox.spock

import org.kodyn.gearbox.GearboxDriver
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification


class GearboxTests extends Specification {

    @Autowired
    GearboxDriver gearboxDriver;

    def setupSpec() {
    }

    def "when handleGas" () {
        int beforeHandleGas = gearboxDriver.getCurrentGear()
        when handleGas()
        int afterHandleGas = gearboxDriver.getCurrentGear()
        than
        assert beforeHandleGas >= afterHandleGas
    }
}