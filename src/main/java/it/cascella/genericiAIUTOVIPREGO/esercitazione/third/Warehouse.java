package it.cascella.genericiAIUTOVIPREGO.esercitazione.third;

import it.cascella.genericiAIUTOVIPREGO.esercitazione.third.impl.Screen;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Box<? extends Component>> boxes;

    public Warehouse() {
        this.boxes = new ArrayList<>();
    }

    public void addToWarehouse(Box<? extends Component> box){
        boxes.add(box);
    }
    public Box<? extends Component> getBox(int index){
        if (index >=0 && index <boxes.size()) {
            return boxes.get(index);
        }
        throw new IndexOutOfBoundsException();
    }
    public List<GigaBox<? extends Component>> getBobo(){
        List<GigaBox<? extends Component>> lista = new ArrayList<>();
        for (Box<? extends Component> box : boxes) {
            if (box instanceof GigaBox<? extends Component> gigaBox) {
                lista.add(gigaBox);
            }
        }
        return lista;
    }
    //TODO con la reflection -> dubito ci riuscirai :D
   /* public List<? extends Box<Screen>> getAllScreenBox(){
        List<? extends Box<Screen>> lista = new ArrayList<>();
        for (Box<? extends Component> screenBox : boxes) {
            if (screenBox instanceof Box<Screen> s){
                lista.add(s);
            }
        }
        return lista;
    }*/
}
