package it.cascella.patterns.factory2.step1;

import it.cascella.patterns.factory2.step1.factory.BossItemFactory;
import it.cascella.patterns.factory2.step1.factory.SpecialFactory;
import it.cascella.patterns.factory2.step1.model.Droppable;

public class Main {
    public static void main(String[] args) {
        BossItemFactory bossItemFactory = new BossItemFactory(new SpecialFactory());
        Droppable item = bossItemFactory.createItem();
        System.out.println(item);
    }
}
