package it.cascella.lambda.step4Live;

public class Potion implements Item{
    private String name;
    private int heal;

    public Potion(String name, int heal) {
        this.name = name;
        this.heal = heal;
    }

    public String getName() {
        return name;
    }

    public int getHeal() {
        return heal;
    }
}
