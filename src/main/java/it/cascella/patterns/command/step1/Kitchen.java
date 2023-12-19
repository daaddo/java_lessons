package it.cascella.patterns.command.step1;

public class Kitchen extends Room{
    private boolean dishesWashed = false;

    public Kitchen(boolean dishesWashed) {
        this.dishesWashed = dishesWashed;
    }
}
