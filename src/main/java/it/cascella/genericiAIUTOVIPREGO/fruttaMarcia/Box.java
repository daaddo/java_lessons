package it.cascella.genericiAIUTOVIPREGO.fruttaMarcia;

import it.cascella.genericiAIUTOVIPREGO.fruttaMarcia.model.Banana;
import it.cascella.genericiAIUTOVIPREGO.fruttaMarcia.model.Droppable;
import it.cascella.genericiAIUTOVIPREGO.fruttaMarcia.model.Fruit;
import it.cascella.genericiAIUTOVIPREGO.fruttaMarcia.model.Mela;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Box<T extends Fruit> {
    private List<T> frutta;
    private T t;
    public Box() {
        this.frutta = new ArrayList<>();
    }
    public void addFruit(T fruit){
        Objects.requireNonNull(fruit);
        frutta.add(fruit);
    }
    public void stampaProv(){
        for (T t : frutta) {
            System.out.println(t.getProvenienza());
        }
    }

    public List<T> getFrutta() {
        return frutta;
    }
}
