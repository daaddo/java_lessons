package it.cascella.genericiAIUTOVIPREGO.esercitazione.third;

import it.cascella.genericiAIUTOVIPREGO.esercitazione.third.impl.Screen;
import it.cascella.genericiAIUTOVIPREGO.esercitazione.third.impl.Shadow;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<Screen> box = new Box<>();
        Box<Shadow> box1 = new Box<>();
        Warehouse warehouse = new Warehouse();
        warehouse.addToWarehouse(box1);
        warehouse.addToWarehouse(box);
        System.out.println("\n");
        Box<? extends Component> box2 = warehouse.getBox(1);
        System.out.println(box2);
        System.out.println("\n asasa");
        warehouse.addToWarehouse(new GigaBox<Screen>(43));
        System.out.println(warehouse.getBox(2));
        List<GigaBox<? extends Component>> bobo = warehouse.getBobo();
        System.out.println(bobo.size());

    }
}
