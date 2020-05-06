package org.kodyn.gearbox;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class GearboxApplicationTests {

    @Autowired
    GearboxDriver driver;

    @Test
    void contextLoads() {
    }

    @Test
    void handleGasTest() {
        int gearBeforeHandleGas = driver.getCurrentGear();
        driver.handleGas(new Threshold(10d));
        int gearAfterHandleGas = driver.getCurrentGear();
        Assert.isTrue(gearAfterHandleGas >= gearBeforeHandleGas, "Gear after handle gas should be greater than before");

    }

}
