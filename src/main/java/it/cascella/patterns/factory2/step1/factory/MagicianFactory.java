package it.cascella.patterns.factory2.step1.factory;

import it.cascella.patterns.factory2.step1.model.Character;
import it.cascella.patterns.factory2.step1.model.Magician;

public class MagicianFactory extends CharacterFactory{

    @Override
    public Character createCharacter() {
        return new Magician("Duddud",43);
    }
}
