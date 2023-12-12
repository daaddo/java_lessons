package it.cascella.annotations.example;

public abstract class Unit {

    private int health;
    private int attack;
    public Unit(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public abstract void fight(Unit enemy);

}
