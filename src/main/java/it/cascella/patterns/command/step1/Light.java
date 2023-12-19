package it.cascella.patterns.command.step1;

public class Light {
    private boolean on = false;

    public void switchLight() {
        on = !on;
    }
    public boolean isOn() {
        return on;
    }
}
