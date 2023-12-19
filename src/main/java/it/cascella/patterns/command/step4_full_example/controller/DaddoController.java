package it.cascella.patterns.command.step4_full_example.controller;

import it.cascella.patterns.command.step4_full_example.commands.Command;

import java.util.EnumMap;

public class DaddoController {


    public enum Buttons{
        ON, OFF, PLUS, MINUS;
    }
    EnumMap<Buttons, Command> commands = new EnumMap<>(Buttons.class);

    public void setCommand(Buttons button, Command command) {
        commands.put(button, command);
    }
    public Command pressButton(Buttons button) {
        Command command = commands.get(button);
        command.execute();
        return command;
    }
    public void reset() {
        commands.clear();
    }
}
