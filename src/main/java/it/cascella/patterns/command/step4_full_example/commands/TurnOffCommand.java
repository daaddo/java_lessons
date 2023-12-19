package it.cascella.patterns.command.step4_full_example.commands;

import it.cascella.patterns.command.step4_full_example.sensors.LightActuator;

public class TurnOffCommand implements Command{
    private LightActuator actuator;

    public TurnOffCommand(LightActuator actuator) {
        this.actuator = actuator;
    }

    public void execute() {
        actuator.turnOff();
    }

    public void undo() {
        actuator.turnOn();
    }

    @Override
    public String toString() {
        return "TurnOffCommand [actuator=" + actuator + "]";
    }

}
