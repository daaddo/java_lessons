package it.cascella.annotations.example;

public class Archer extends Unit{

    private int range;
    public Archer(int health, int attack, int range) {
        super(health, attack);
        this.range=range;
    }
    @Override
    @Bugged(note = "Dobbiamo sistemare il fatto del range")
    public void fight(Unit enemy) {
        enemy.setHealth(enemy.getHealth()-this.getAttack());
    }
}
