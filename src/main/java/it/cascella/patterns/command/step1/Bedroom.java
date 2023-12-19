package it.cascella.patterns.command.step1;

import it.cascella.patterns.command.step2.FloorLamp;

public class Bedroom extends Room{
    private boolean bedMade = false;

    public Bedroom(boolean bedMade) {
        this.bedMade = bedMade;
    }


}
