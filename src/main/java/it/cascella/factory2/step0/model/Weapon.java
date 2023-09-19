package it.cascella.factory2.step0.model;

public class Weapon extends Item{
    private int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Weapon(Rarity rarity, String name, int damage) {
        super(rarity, name);
        this.damage = damage;
    }
}
