package it.cascella.factory.step0.model;

public class Weapon extends Item {

    private int damage;

    public Weapon(int id, String name, int damage) {
        super(id, name);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


}
