package tdd.uppgift;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    @Test
    public void testCar() {
        Car carCheck = new Car();
        assertNotNull(carCheck, "Car exists");

    }

    @Test
    public void testLights() {
        Car lightsCheck = new Car();
        assertNotNull(lightsCheck.lights, "The car has lights");
    }
    @Test
    public void testLightsOn() {
        Car lightsCheck = new Car();
        assertTrue(lightsCheck.lights, "The car are on");
    }

    @Test
    public void testLightsOff() {
        Car lightsCheck = new Car();
        lightsCheck.turnOffLights();
        assertFalse(lightsCheck.lights, "The lights are off");
    }

    @Test
    public void testLightsOnAgain() {
        Car lightsCheck = new Car();
        lightsCheck.turnOnLights();
        assertTrue(lightsCheck.lights, "The lights are on");
    }

    @Test
    public void testLightsFull() {
        Car lightsCheck = new Car();
        lightsCheck.turnLightsToFull();
        assertTrue(lightsCheck.beam, "The lights are full");
    }

    @Test
    public void testLightsHalf() {
        Car lightsCheck = new Car();
        lightsCheck.turnLightsToHalf();
        assertFalse(lightsCheck.beam, "The lights are half");
    }

}
