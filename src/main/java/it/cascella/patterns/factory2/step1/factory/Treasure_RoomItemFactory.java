package it.cascella.patterns.factory2.step1.factory;


import it.cascella.patterns.factory2.step1.model.Droppable;
import it.cascella.patterns.factory2.step1.model.Rarity;
import it.cascella.patterns.factory2.step1.model.Weapon;

public class Treasure_RoomItemFactory extends ItemFactory {
    public Treasure_RoomItemFactory(CharacterFactory characterFactory) {
        super(characterFactory);
    }

    @Override
    public Droppable createItem() {
        if (Math.random() > 0.3) {
            return new Weapon(Rarity.LEGENDARY, "Spada", 10);
        } else {
            return new Weapon(Rarity.MYTHIC, "Lancia Gigante", 10);
        }
    }
}
