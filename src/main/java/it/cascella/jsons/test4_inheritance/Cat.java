package it.cascella.jsons.test4_inheritance;

public class Cat  extends Animale{
    private String padrone;

    public Cat() {
    }

    public Cat(String nome, String razza, int eta, String padrone) {
        super(nome, razza, eta);
        this.padrone = padrone;
    }

    public String getPadrone() {
        return padrone;
    }

    public void setPadrone(String padrone) {
        this.padrone = padrone;
    }
    //to string
    @Override
    public String toString() {
        return "Cat [padrone=" + padrone + ", getNome()=" + getNome() + ", getRazza()=" + getRazza() + ", getEta()="
                + getEta() + "]";
    }
}
