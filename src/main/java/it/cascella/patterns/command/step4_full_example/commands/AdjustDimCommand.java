package it.cascella.patterns.command.step4_full_example.commands;

import it.cascella.patterns.command.step4_full_example.sensors.DimmableLightActuator;

public class AdjustDimCommand implements Command {
    private int delta;
    private DimmableLightActuator actuator;

    public AdjustDimCommand(DimmableLightActuator actuator, int delta) {
        this.actuator = actuator;
        this.delta = delta;
    }


    @Override
    public void execute() {
        actuator.setDimmingLevel(actuator.getDimmingLevel() + delta);
    }

    @Override
    public void undo() {
        actuator.setDimmingLevel(actuator.getDimmingLevel() - delta);
    }

    @Override
    public String toString() {
        return "AdjustDimCommand [delta=" + delta + ", actuator=" + actuator + "]";
    }
}
