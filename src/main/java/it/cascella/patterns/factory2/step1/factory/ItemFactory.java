package it.cascella.patterns.factory2.step1.factory;
import it.cascella.patterns.factory2.step1.model.Character;
import it.cascella.patterns.factory2.step1.model.Droppable;

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
