package it.cascella.patterns.factory2.step0.model;

public abstract class Item {
    private Rarity rarity;
    private String name;

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item(Rarity rarity, String name) {
        this.rarity = rarity;
        this.name = name;
    }
}
