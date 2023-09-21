package tdd.uppgift;

public class Car {
    boolean runningCar;
    boolean brakeLights;
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
    public void turnCarOn() {
        this.runningCar = true;
    }
    
    public void turnCarOff(){
        this.runningCar = false;
    }
}
