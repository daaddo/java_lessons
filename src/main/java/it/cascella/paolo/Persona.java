package it.cascella.paolo;

public class Persona {
    private String nome;
    private String cognome;
    private int vittorie;
    private int sconfitte;

    public Persona() {
    }

    public Persona(String nome, String cognome, int vittorie, int sconfitte) {
        this.nome = nome;
        this.cognome = cognome;
        this.vittorie = vittorie;
        this.sconfitte = sconfitte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getVittorie() {
        return vittorie;
    }

    public void setVittorie(int vittorie) {
        this.vittorie = vittorie;
    }

    public int getSconfitte() {
        return sconfitte;
    }

    public void setSconfitte(int sconfitte) {
        this.sconfitte = sconfitte;
    }
}
