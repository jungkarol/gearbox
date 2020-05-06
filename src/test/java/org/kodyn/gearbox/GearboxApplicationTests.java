package org.kodyn.gearbox;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class GearboxApplicationTests {

    @Test
    void contextLoads() {
        GearboxDriver driver = new GearboxDriver();

        int gearBeforeHandleGas = driver.getCurrentGear();
        driver.handleGas(new Threshold(10d));
        int gearAfterHandleGas = driver.getCurrentGear();
        Assert.isTrue(gearAfterHandleGas >= gearBeforeHandleGas, "Gear after handle gas should be greater than before");
    }

}
