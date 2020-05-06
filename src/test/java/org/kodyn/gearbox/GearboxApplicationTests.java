package org.kodyn.gearbox;

import org.junit.jupiter.api.Test;
import org.kodyn.gearbox.gearbox.GearboxConfig;
import org.kodyn.gearbox.gearbox.GearboxImpl;
import org.kodyn.gearbox.gearbox.GearboxMode;
import org.kodyn.gearbox.gearbox.GearboxState;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class GearboxApplicationTests {

	@Test
	void contextLoads() {
		GearboxConfig config = new GearboxConfig(8, 3, GearboxState.PARK, GearboxMode.ECO, false);
		GearboxDriver driver = new GearboxDriver(new GearboxImpl(config));

		int gearBeforeHandleGas = driver.getCurrentGear();
		driver.handleGas(new Threshold(10d));
		int gearAfterHandleGas = driver.getCurrentGear();
		Assert.isTrue(gearAfterHandleGas >= gearBeforeHandleGas, "Gear after handle gas should be greater than before");
	}

}
