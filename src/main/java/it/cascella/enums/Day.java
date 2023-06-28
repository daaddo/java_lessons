package it.cascella.enums;

public class Day {

    private int number;
    private GiornoDellaSettimana giornoDellaSettimana;

    public Day(int number, GiornoDellaSettimana giornoDellaSettimana) {
        this.number = number;
        this.giornoDellaSettimana = giornoDellaSettimana;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public GiornoDellaSettimana getGiornoDellaSettimana() {
        return giornoDellaSettimana;
    }

    public void setGiornoDellaSettimana(GiornoDellaSettimana giornoDellaSettimana) {
        this.giornoDellaSettimana = giornoDellaSettimana;
    }
}
