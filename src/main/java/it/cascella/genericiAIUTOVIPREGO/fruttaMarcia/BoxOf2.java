package it.cascella.genericiAIUTOVIPREGO.fruttaMarcia;

import it.cascella.genericiAIUTOVIPREGO.fruttaMarcia.model.Fruit;

public class BoxOf2<T extends Fruit, S extends Fruit>{
    private Box<T> box1;
    private Box<S> box2;

    public BoxOf2() {
        box1 = new Box<>();
        box2 = new Box<>();
    }
    public void addFruit(T fruit){
        box1.addFruit(fruit);
    }
    public void addFruit2(S fruit){
        box2.addFruit(fruit);
    }

}
