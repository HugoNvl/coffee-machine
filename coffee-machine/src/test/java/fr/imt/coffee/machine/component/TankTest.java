package fr.imt.coffee.machine.component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TankTest {

    @Test
    public void testDecreaseVolumeInTank() throws InterruptedException {

        double volumeToDecrease = 80;
        double decreaseVolumeExpected = 170;

        Tank tank = new Tank(250, 20, 300);
        tank.decreaseVolumeInTank(volumeToDecrease);
        double decreaseVolumeActual = tank.getActualVolume();

        Assertions.assertEquals(decreaseVolumeExpected, decreaseVolumeActual);
    }

    @Test
    public void testIncreaseVolumeInTank() throws InterruptedException {

        double volumeToIncrease = 70;
        double increaseVolumeExpected = 270;

        Tank tank = new Tank(200, 20, 300);
        tank.increaseVolumeInTank(volumeToIncrease);
        double increaseVolumeActual = tank.getActualVolume();

        Assertions.assertEquals(increaseVolumeExpected, increaseVolumeActual);
    }
}
