package it.cascella.patterns.factory2.step0.model;

public class Potion extends Item{
    private int mana;

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Potion(Rarity rarity, String name, int mana) {
        super(rarity, name);
        this.mana = mana;
    }
}
