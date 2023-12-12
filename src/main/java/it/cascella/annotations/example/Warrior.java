package it.cascella.annotations.example;

public class Warrior extends Unit{

        private int armor;
        public Warrior(int health, int attack, int armor) {
            super(health, attack);
            this.armor=armor;
        }

        @Override
        @Bugged
        public void fight(Unit enemy) {
            enemy.setHealth(enemy.getHealth()-this.getAttack()+this.armor);
        }
}
