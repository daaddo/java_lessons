package it.cascella.patterns.factory2.step0.factory;

import it.cascella.patterns.factory2.step0.model.Item;

import it.cascella.patterns.factory2.step0.model.*;

public class ItemFactory {
    public static Item createItem(RoomType roomType) {


        switch (roomType) {
            case DUNGEON -> {
                //in questo caso c'è una uguale probabilità di ottenere un item di rarità comune, rara, epica, leggendaria o mitica di qualsiasi oggetto
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
            case BOSS_ROOM -> {
                //genera una probabilità del 50%
                if (Math.random() > 0.5) {
                    return new Weapon(Rarity.MYTHIC, "Spada", 10);
                } else {
                    return new Shield(Rarity.MYTHIC, "Scudo", 10);
                }
            }
            case TREASURE_ROOM -> {
                if (Math.random() > 0.3) {
                    return new Weapon(Rarity.LEGENDARY, "Spada", 10);
                } else {
                    return new Weapon(Rarity.MYTHIC, "Lancia Gigante", 10);
                }
            }
            case REST_ROOM -> {
                return new Potion(Rarity.RARE, "Pozione", 10);
            }
            default -> throw new IllegalArgumentException("RoomType not supported");
        }



    }
}
