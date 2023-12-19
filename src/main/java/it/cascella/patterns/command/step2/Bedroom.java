package it.cascella.patterns.command.step2;

public class Bedroom extends Room {
    private boolean bedMade = false;
    private FloorLamp floorLamp = new FloorLamp(5, new Light());

    public Bedroom(boolean bedMade) {
        this.bedMade = bedMade;
    }
    public void switchFloorLamp() {
        floorLamp.switchLight();
    }


}
