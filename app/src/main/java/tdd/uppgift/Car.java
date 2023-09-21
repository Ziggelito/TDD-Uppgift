package tdd.uppgift;

public class Car {
    boolean lights;
    boolean beam;
    public Car() {
       this.lights = true;
    }

    public void turnOffLights() {
        this.lights = false;
    }

    public void turnOnLights() {
        this.lights = true;
    }

    public void turnLightsToFull() {
        this.beam = true;
    }

    public void turnLightsToHalf() {
        this.beam = false;
    }
}
