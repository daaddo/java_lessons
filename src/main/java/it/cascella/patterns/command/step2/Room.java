package it.cascella.patterns.command.step2;

public abstract class Room {
    private Light light = new Light();

    public void switchLight() {
        light.switchLight();
    }

    public boolean isLightOn() {
        return light.isOn();
    }
}
