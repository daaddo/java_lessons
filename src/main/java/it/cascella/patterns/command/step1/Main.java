package it.cascella.patterns.command.step1;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom(false);
        Kitchen kitchen = new Kitchen(false);
        System.out.println("Bedroom light is on? " + bedroom.isLightOn());
        System.out.println("Kitchen light is on? " + kitchen.isLightOn());
        bedroom.switchLight();
        kitchen.switchLight();
        System.out.println("Bedroom light is on? " + bedroom.isLightOn());
        System.out.println("Kitchen light is on? " + kitchen.isLightOn());

    }
}
