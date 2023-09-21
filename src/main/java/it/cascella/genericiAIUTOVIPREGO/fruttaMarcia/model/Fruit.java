package it.cascella.genericiAIUTOVIPREGO.fruttaMarcia.model;

public abstract class Fruit{
    private int peso;
    private String provenienza;

    public Fruit(int peso, String provenienza) {
        this.peso = peso;
        this.provenienza = provenienza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getProvenienza() {
        return provenienza;
    }

    public void setProvenienza(String provenienza) {
        this.provenienza = provenienza;
    }
}
