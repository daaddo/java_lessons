package it.cascella.patterns.factory2.step1.model;

public class Soldato extends Character{
    private int hp;

    public Soldato(String name, int hp) {
        super(name);
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
