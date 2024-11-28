package it.cascella.patterns.factory2.step1.factory;

import it.cascella.patterns.factory2.step1.model.Droppable;
import it.cascella.patterns.factory2.step1.model.Potion;
import it.cascella.patterns.factory2.step1.model.Rarity;

public class Rest_RoomItemFactory extends ItemFactory{
    public Rest_RoomItemFactory(CharacterFactory characterFactory) {
        super(characterFactory);
    }

    @Override
    public Droppable createItem() {
        return new Potion(Rarity.RARE, "Pozione", 10);
    }
}
