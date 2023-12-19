package it.cascella.patterns.command.step3_pattern.commands;

import it.cascella.patterns.command.step3_pattern.Light;

public class SwitchLightWithTimerCommand implements Command {
    private Light light;
    private int timer;

    public SwitchLightWithTimerCommand(Light light, int timer) {
        this.light = light;
        this.timer = timer;
    }

    @Override
    public void execute() {
        try {
            Thread.sleep(timer);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        light.switchLight();
    }
}
