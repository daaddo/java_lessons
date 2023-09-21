package it.cascella.genericiAIUTOVIPREGO.esercitazione.third;

public class GigaBox<T extends Component> extends Box<T> {
    private int peso;
    public GigaBox(int peso) {
        super();
        this.peso=peso;
    }

    public int getMaxWeight(){
        return peso;
    }
}
