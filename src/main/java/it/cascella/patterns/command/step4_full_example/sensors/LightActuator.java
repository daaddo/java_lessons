package it.cascella.patterns.command.step4_full_example.sensors;

public class LightActuator implements Actuator {

    private boolean on = false;
    private String name;
    private String id;

    public LightActuator(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }

    @Override
    public String toString() {
        return "LightActuator [on=" + on + ", name=" + name + ", id=" + id + "]";
    }
}