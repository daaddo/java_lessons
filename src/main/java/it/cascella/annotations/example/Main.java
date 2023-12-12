package it.cascella.annotations.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Warrior warrior = new Warrior(100, 10, 5);
        Archer archer = new Archer(50, 5, 10);

        boolean enemyDefeated = FightManager.getInstance().fight(warrior, archer);
        if (enemyDefeated) {
            System.out.println("Enemy defeated!");
        } else {
            System.out.println("Enemy still alive!");
        }

        boolean fight = FightManager.getInstance().fight(archer, warrior);
        if (fight) {
            System.out.println("Enemy defeated!");
        } else {
            System.out.println("Enemy still alive!");
        }
    }
}
