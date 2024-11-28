package it.cascella.patterns.factory2.step1.model;

public class Magician extends Character{
    private int mana;

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Magician(String name, int mana) {
        super(name);
        this.mana = mana;
    }
}
