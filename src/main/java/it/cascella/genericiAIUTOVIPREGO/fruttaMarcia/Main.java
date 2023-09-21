package it.cascella.genericiAIUTOVIPREGO.fruttaMarcia;

import it.cascella.genericiAIUTOVIPREGO.fruttaMarcia.model.Banana;
import it.cascella.genericiAIUTOVIPREGO.fruttaMarcia.model.Fruit;
import it.cascella.genericiAIUTOVIPREGO.fruttaMarcia.model.Mela;
import it.cascella.genericiAIUTOVIPREGO.fruttaMarcia.model.Pesca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box<Banana> box = new Box<>();
        box.addFruit(new Banana(400,"Cile"));
        Box<Pesca> boxDiPesche = new Box<>();
        boxDiPesche.addFruit(new Pesca(3422,"aiuto"));
        Box<Fruit> box3 = new Box<>();
        box3.addFruit(new Pesca(432,"wow"));
        box3.addFruit(new Banana(432,"wow"));
        BoxOf2<Pesca,Mela> boxxer = new BoxOf2<>();
        boxxer.addFruit(new Pesca(232,"gege"));
        boxxer.addFruit2(new Mela(232,"gege"));
        BoxChecker.getInstance().checkMaxWeight(box, 400);
    }
}
