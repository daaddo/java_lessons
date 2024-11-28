package it.cascella.patterns.factory2.step1.model;

public abstract class Item implements Droppable {
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

    @Override
    public String toString() {
        return "Item{" +
                "rarity=" + rarity +
                ", name='" + name + '\'' +
                '}';
    }
}
