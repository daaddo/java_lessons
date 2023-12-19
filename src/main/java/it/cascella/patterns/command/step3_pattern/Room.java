package it.cascella.patterns.command.step3_pattern;

import it.cascella.patterns.command.step3_pattern.commands.Command;

public abstract class Room {
    private Command lightCommand;

    public Room(Command lightCommand) {
        this.lightCommand = lightCommand;
    }

    public void setLightCommand(Command lightCommand) {
        this.lightCommand = lightCommand;
    }
    public void executeCommand() {
        lightCommand.execute();
    }

}
