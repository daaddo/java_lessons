package it.cascella.patterns.command.step4_full_example;

import it.cascella.patterns.command.step4_full_example.commands.AdjustDimCommand;
import it.cascella.patterns.command.step4_full_example.commands.TurnOffCommand;
import it.cascella.patterns.command.step4_full_example.commands.TurnOnCommand;
import it.cascella.patterns.command.step4_full_example.controller.DaddoController;
import it.cascella.patterns.command.step4_full_example.managers.SmartHomeManager;
import it.cascella.patterns.command.step4_full_example.sensors.DimmableLightActuator;
import it.cascella.patterns.command.step4_full_example.sensors.LightActuator;

public class Main {
    public static void main(String[] args) {
        LightActuator floorLamp = new LightActuator("Floor lamp","1");
        LightActuator ceilingLamp = new LightActuator("Ceiling lamp","2");
        DimmableLightActuator dimmableLamp = new DimmableLightActuator("Dimmable lamp","3");


        SmartHomeManager.getInstance().addActuator(floorLamp);
        SmartHomeManager.getInstance().addActuator(ceilingLamp);
        SmartHomeManager.getInstance().addActuator(dimmableLamp);

        SmartHomeManager.getInstance().setCommand(DaddoController.Buttons.ON, new TurnOnCommand(floorLamp));
        SmartHomeManager.getInstance().setCommand(DaddoController.Buttons.OFF, new TurnOffCommand(floorLamp));
        SmartHomeManager.getInstance().setCommand(DaddoController.Buttons.MINUS, new AdjustDimCommand(dimmableLamp, -10));
        SmartHomeManager.getInstance().setCommand(DaddoController.Buttons.PLUS, new AdjustDimCommand(dimmableLamp, 10));

        SmartHomeManager.getInstance().pressButton(DaddoController.Buttons.ON);
        SmartHomeManager.getInstance().pressButton(DaddoController.Buttons.PLUS);
        System.out.println("\n\n");
        SmartHomeManager.getInstance().printActuatorsStatus();
        System.out.println("\n\n");

        SmartHomeManager.getInstance().printControllerStatus();
        System.out.println("\n\n");

        SmartHomeManager.getInstance().printExecutionHistory();
        System.out.println("\n\n");
        System.out.println(floorLamp.isOn());
        System.out.println("\n\n");
        System.out.println(dimmableLamp.getDimmingLevel());
        SmartHomeManager.getInstance().undoLastCommand();
        System.out.println(dimmableLamp.getDimmingLevel());
        SmartHomeManager.getInstance().undoLastCommand();
        System.out.println(floorLamp.isOn());
    }
}
