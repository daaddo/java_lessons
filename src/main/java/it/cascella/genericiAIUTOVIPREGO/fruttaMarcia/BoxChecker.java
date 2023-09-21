package it.cascella.genericiAIUTOVIPREGO.fruttaMarcia;

import it.cascella.genericiAIUTOVIPREGO.fruttaMarcia.model.Banana;
import it.cascella.genericiAIUTOVIPREGO.fruttaMarcia.model.Fruit;

public class BoxChecker {
    private static BoxChecker instance=null;
    private BoxChecker(){
    }
    public static BoxChecker getInstance(){
        if (instance ==null) {
            instance = new BoxChecker();
        }
        return instance;
    }
    public  boolean checkMaxWeight(Box<? super Banana> fruttabox, int pesomax){
        int a = 0;
        for (int i = 0; i < fruttabox.getFrutta().size(); i++) {
            a +=fruttabox.getFrutta().get(i).getPeso();
        }
        return (a>pesomax);
    }
}
