package fr.imt.coffee.machine.component;

import fr.imt.coffee.storage.type.CoffeeType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoffeeGrinderTest {

    @Test
    public void testCoffeeGrinder() throws InterruptedException {

        int grindingTimeExpected = 5000;
        BeanTank beanTank = new BeanTank(150, 10, 200, CoffeeType.ARABICA);

        CoffeeGrinder coffeeGrinder = new CoffeeGrinder(grindingTimeExpected);
        double grindingTimeActual = coffeeGrinder.grindCoffee(beanTank);


        Assertions.assertEquals(grindingTimeExpected, grindingTimeActual);
    }
}
