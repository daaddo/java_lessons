package it.cascella.factory2.step1.factory;

import it.cascella.factory2.step1.factory.ItemFactory;
import it.cascella.factory2.step1.*;
import it.cascella.factory2.step1.model.*;

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
