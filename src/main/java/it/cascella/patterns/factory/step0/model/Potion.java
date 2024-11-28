package it.cascella.patterns.factory.step0.model;

public class Potion extends Item {
    private int mana;

    public Potion(int id, String name, int mana) {
        super(id, name);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
