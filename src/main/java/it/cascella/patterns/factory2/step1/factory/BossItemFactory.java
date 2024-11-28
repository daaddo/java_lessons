package it.cascella.patterns.factory2.step1.factory;



import it.cascella.patterns.factory2.step1.model.Droppable;
import it.cascella.patterns.factory2.step1.model.Rarity;
import it.cascella.patterns.factory2.step1.model.Shield;
import it.cascella.patterns.factory2.step1.model.Weapon;

public class BossItemFactory extends ItemFactory{
    public BossItemFactory(CharacterFactory characterFactory) {
        super(characterFactory);
    }

    @Override
    public Droppable createItem() {
        if (Math.random() <0.1) {
            return createCharacter();
        }
        if (Math.random() > 0.5) {
            return new Weapon(Rarity.MYTHIC, "Spada", 10);
        } else {
            return new Shield(Rarity.MYTHIC, "Scudo", 10);
        }
    }
}
