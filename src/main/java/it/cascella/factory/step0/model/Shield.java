package it.cascella.factory.step0.model;

public class Shield extends Item {

    private int defence;

    public Shield(int id, String name, int defence) {
        super(id, name);
        this.defence = defence;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

}
