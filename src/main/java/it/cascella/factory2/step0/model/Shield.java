package it.cascella.factory2.step0.model;

public class Shield extends Item{
    private int defence;

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public Shield(Rarity rarity, String name, int defence) {
        super(rarity, name);
        this.defence = defence;
    }
}
