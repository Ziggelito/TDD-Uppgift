package tdd.uppgift;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    Car testCar;
    @BeforeEach
    void setUp(){
        testCar = new Car();
    }

    @Test
    public void testCar() {

        assertNotNull(testCar, "Car exists");

    }

    @Test
    public void testLights() {
        assertNotNull(testCar.lights, "The car has lights");
    }
    @Test
    public void testLightsOn() {
        testCar.turnOnLights();
        assertTrue(testCar.lights, "The car are on");
    }

    @Test
    public void testLightsOff() {
        testCar.turnOffLights();
        assertFalse(testCar.lights, "The lights are off");
    }

    @Test
    public void testLightsOnAgain() {
        testCar.turnOnLights();
        assertTrue(testCar.lights, "The lights are on");
    }

    @Test
    public void testLightsFull() {
        testCar.turnLightsToFull();
        assertTrue(testCar.beam, "The lights are full");
    }

    @Test
    public void testLightsHalf() {
        testCar.turnLightsToHalf();
        assertFalse(testCar.beam, "The lights are half");
    }

    @Test
    public void testBrakeLights() {
        assertNotNull(testCar.brakeLights, "The car has lights");
    }

    @Test
    public void testCarRunning(){
        assertFalse(testCar.runningCar);

    }
    @Test
    public void testTurnCarOff() {
        testCar.turnCarOff();
        assertFalse(testCar.runningCar);
    }
    @Test
    public void testTurnCarOn() {
        testCar.turnCarOn();
        assertTrue(testCar.runningCar);
    }
    @Test
    public void carOffLightsOff() {
        testCar.turnCarOn();
        testCar.turnOnLights();
        testCar.turnCarOff();
        assertFalse(testCar.lights);
        assertFalse(testCar.runningCar);
    }
}
