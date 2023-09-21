package tdd.uppgift;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarTest {
    @Test
    public void testCar() {
        car carTest = new car();
        assertNotNull(carTest, "Car exists");

    }

    @Test
    public void testLights() {

    }
}
