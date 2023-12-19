package it.cascella.patterns.command.step3_pattern.commands;

import it.cascella.patterns.command.step3_pattern.Light;

public class SwitchLightCommand implements Command{
    private Light light;

    public SwitchLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchLight();
    }
}
