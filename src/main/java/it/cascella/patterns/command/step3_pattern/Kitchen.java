package it.cascella.patterns.command.step3_pattern;

import it.cascella.patterns.command.step3_pattern.commands.Command;

public class Kitchen extends Room {
    private boolean dishesWashed = false;

    public Kitchen(Command lightCommand, boolean dishesWashed) {
        super(lightCommand);
        this.dishesWashed = dishesWashed;
    }
}
