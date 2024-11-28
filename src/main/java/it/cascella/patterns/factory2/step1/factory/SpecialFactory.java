package it.cascella.patterns.factory2.step1.factory;

import it.cascella.patterns.factory2.step1.model.Character;
import it.cascella.patterns.factory2.step1.model.Soldato;

public class SpecialFactory extends CharacterFactory{
    @Override
    public Character createCharacter() {
        return new Soldato("nonno",43);
    }
}
