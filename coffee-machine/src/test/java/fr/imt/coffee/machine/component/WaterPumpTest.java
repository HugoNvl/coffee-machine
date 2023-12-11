package fr.imt.coffee.machine.component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WaterPumpTest {

    @Test
    public void testPumpWater() throws InterruptedException {

        double waterVolume = 0.06;
        WaterTank waterTank = new WaterTank(250, 20, 300);

        double pumpingCapacity = 0.02;
        WaterPump waterPump = new WaterPump(pumpingCapacity);

        /**
         * pumpingTime en ms : (volume / débit) * 1000, avec volume en mL et débit en mL/s
         */
        double pumpingTimeExpected = 3000;
        double pumpingTimeActual = waterPump.pumpWater(waterVolume, waterTank);

        Assertions.assertEquals(pumpingTimeExpected, pumpingTimeActual);
    }
}
