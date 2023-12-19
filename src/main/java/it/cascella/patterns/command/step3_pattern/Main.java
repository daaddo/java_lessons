package it.cascella.patterns.command.step3_pattern;

import it.cascella.patterns.command.step3_pattern.commands.SwitchLightCommand;
import it.cascella.patterns.command.step3_pattern.commands.SwitchLightWithTimerCommand;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom(false, new SwitchLightWithTimerCommand(new Light(),5));
        Kitchen kitchen = new Kitchen(new SwitchLightCommand(new Light()), false);

    }
}
