package it.cascella.genericiAIUTOVIPREGO.esercitazione.third;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Component> {
   private List<T> components;

    public Box() {
        this.components = new ArrayList<>();
    }
    public void addComponent(T comp){
        this.components.add(comp);
    }
}
