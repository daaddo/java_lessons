package it.cascella.factory2.step1.factory;

import it.cascella.factory2.step1.model.*;

public class DungeonItemFactory extends ItemFactory{


    public DungeonItemFactory(CharacterFactory characterFactory) {
        super(characterFactory);
    }

    @Override
    public Droppable createItem() {
        int randomRarity = (int) (Math.random() * Rarity.values().length);
        Rarity rarity = Rarity.values()[randomRarity];
        int randomItemType = (int) (Math.random() * 3);
        return switch (randomItemType) {
            case 0 -> new Shield(rarity, "Shield", 10);
            case 1 -> new Weapon(rarity, "Spada", 10);
            case 2 -> new Potion(rarity, "Pozione", 10);
            default -> throw new IllegalArgumentException("ItemType not supported");
        };
    }
}
