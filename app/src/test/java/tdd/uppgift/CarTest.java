package tdd.uppgift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {
    @Test
    public void testCar() {
        car carCheck = new car();
        assertNotNull(carCheck, "Car exists");

    }

    @Test
    public void testLights() {
        car lightsCheck = new car();
        assertTrue(lightsCheck.lights, "The car has lights");


    }
}
