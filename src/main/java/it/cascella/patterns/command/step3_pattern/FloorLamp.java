package it.cascella.patterns.command.step3_pattern;

import java.util.Date;

public class FloorLamp {
    private int autoOffTime;
    private Light light = new Light();

    public FloorLamp(int time, Light light) {
        this.autoOffTime = time;
        this.light = light;
    }

    public void switchLight() {
        Date now = new Date();
        int hours = now.getHours();
        if (hours >= autoOffTime) {
            light.switchLight();
        }
    }

}
