package it.cascella.patterns.command.step2;

public class Kitchen extends Room {
    private boolean dishesWashed = false;

    public Kitchen(boolean dishesWashed) {
        this.dishesWashed = dishesWashed;
    }
}
