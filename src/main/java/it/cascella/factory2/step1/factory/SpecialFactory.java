package it.cascella.factory2.step1.factory;

import it.cascella.factory2.step1.model.Character;
import it.cascella.factory2.step1.model.Soldato;

public class SpecialFactory extends CharacterFactory{
    @Override
    public Character createCharacter() {
        return new Soldato("nonno",43);
    }
}
