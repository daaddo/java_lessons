package it.cascella.factory2.step1.factory;

import it.cascella.factory2.step1.model.*;

public class Rest_RoomItemFactory extends ItemFactory{
    public Rest_RoomItemFactory(CharacterFactory characterFactory) {
        super(characterFactory);
    }

    @Override
    public Droppable createItem() {
        return new Potion(Rarity.RARE, "Pozione", 10);
    }
}
