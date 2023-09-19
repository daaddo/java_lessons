package it.cascella.factory2.step1.factory;
import it.cascella.factory2.step1.model.*;
import it.cascella.factory2.step1.model.Character;
public abstract class ItemFactory {

    private CharacterFactory characterFactory;

    public ItemFactory(CharacterFactory characterFactory) {
        this.characterFactory = characterFactory;
    }

    public abstract Droppable createItem();

    public Character createCharacter() {
        return characterFactory.createCharacter();
    }


}
