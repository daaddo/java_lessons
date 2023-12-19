package it.cascella.patterns.command.step4_full_example.sensors;

public class DimmableLightActuator implements Actuator {
    private int dimmingLevel = 0;
    private String name;
    private String id;

    public DimmableLightActuator(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void setDimmingLevel(int dimmingLevel) {
        if (dimmingLevel < 0 || dimmingLevel > 100) {
            System.err.println("Dimming level must be between 0 and 100");
        }
        this.dimmingLevel = dimmingLevel;
    }

    public int getDimmingLevel() {
        return this.dimmingLevel;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getId() {
        return this.id;
    }
    @Override
    public String toString() {
        return "DimmableLightActuator [dimmingLevel=" + dimmingLevel + ", name=" + name + ", id=" + id + "]";
    }
}
