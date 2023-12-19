package it.cascella.patterns.command.step4_full_example.commands;

import it.cascella.patterns.command.step4_full_example.sensors.Actuator;
import it.cascella.patterns.command.step4_full_example.sensors.LightActuator;

public class TurnOnCommand implements Command{

    private LightActuator actuator;

    public TurnOnCommand(Actuator actuator) {
        this.actuator = (LightActuator) actuator;
    }

    @Override
    public void execute() {
        actuator.turnOn();
    }

    @Override
    public void undo() {
        actuator.turnOff();
    }

    @Override
    public String toString() {
        return "TurnOnCommand [actuator=" + actuator + "]";
    }
}
