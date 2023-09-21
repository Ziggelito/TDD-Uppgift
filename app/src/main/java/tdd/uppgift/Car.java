package tdd.uppgift;

public class Car {
    public long speed = 0;
    public boolean warningLights = true;
    boolean runningCar;
    boolean brakeLights;
    boolean lights;
    boolean beam;
    public Car() {
       this.lights = false;
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
        this.lights = false;
    }

    public void accelerate() {
        if(speed < 180){
            speed = speed + 5;
        } else {
            speed = speed + 0;
        }
    }

    public void deccelerate() {
        speed = speed - 5;
    }
}
