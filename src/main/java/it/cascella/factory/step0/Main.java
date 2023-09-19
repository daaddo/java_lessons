package it.cascella.factory.step0;

import it.cascella.factory.step0.model.Item;

public class Main {

    // https://www.youtube.com/watch?v=EcFVTgRHJLM

    public static void main(String[] args) {
        System.out.println("STEP 0");
        Item item = ItemGenerator.generateItem(ItemGenerator.ItemType.POTION);
        Item item2 = ItemGenerator.generateItem(ItemGenerator.ItemType.SHIELD);
        System.out.println("Item: " + item.getName());
        System.out.println("Item2: " + item2.getName());

    }
}