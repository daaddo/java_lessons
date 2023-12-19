package it.cascella.patterns.command.step3_pattern;

import it.cascella.patterns.command.step3_pattern.commands.Command;

public class Bedroom extends Room {
    private boolean bedMade = false;

    public Bedroom(boolean bedMade, Command lightCommand) {
        super(lightCommand);
        this.bedMade = bedMade;
    }


}
