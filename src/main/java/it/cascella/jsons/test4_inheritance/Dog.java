package it.cascella.jsons.test4_inheritance;

public class Dog extends Animale{
    private String padrone;

    public Dog() {
    }

    public Dog(String nome, String razza, int eta, String padrone) {
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
        return "Dog [padrone=" + padrone + ", getNome()=" + getNome() + ", getRazza()=" + getRazza() + ", getEta()="
                + getEta() + "]";
    }
}
