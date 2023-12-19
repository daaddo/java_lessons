package it.cascella.patterns.command.step4_full_example.managers;

import it.cascella.patterns.command.step4_full_example.commands.Command;
import it.cascella.patterns.command.step4_full_example.controller.DaddoController;
import it.cascella.patterns.command.step4_full_example.sensors.Actuator;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeManager {
    private static SmartHomeManager instance = null;

    private DaddoController controller = new DaddoController();
    private List<Actuator> actuators = new ArrayList<>();
    private List<Command> executionHistory = new ArrayList<>();
    
    private SmartHomeManager() {
    }
    
    public static SmartHomeManager getInstance() {
        if (instance == null) {
            instance = new SmartHomeManager();
        }
        return instance;
    }

    public void addActuator(Actuator actuator) {
        actuators.add(actuator);
    }

    public void setCommand(DaddoController.Buttons button, Command command) {
        controller.setCommand(button, command);
    }

    public void pressButton(DaddoController.Buttons button) {
        executionHistory.add(controller.pressButton(button));
    }

    public void reset() {
        controller.reset();
    }

    public void printExecutionHistory() {
        System.out.println("Execution history:");
        for (Command command : executionHistory) {
            System.out.println(command);
        }
    }

    public void printActuatorsStatus() {
        System.out.println("Actuators status:");
        for (Actuator actuator : actuators) {
            System.out.println(actuator);
        }
    }

    public void printControllerStatus() {
        System.out.println("Controller status:");
        System.out.println(controller);
    }

    public void undoLastCommand() {
        if (!executionHistory.isEmpty()) {
            executionHistory.remove(executionHistory.size() - 1).undo();
        }
    }


}
