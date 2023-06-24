package it.cascella.enums;

public class Main {

    public static void main(String[] args) {
        Day oggi = new Day(1, GiornoDellaSettimana.MONDAY);
        Day domani = new Day(1, GiornoDellaSettimana.TUESDAY);

        if(oggi.getGiornoDellaSettimana() == GiornoDellaSettimana.MONDAY) {
            System.out.println("Oggi è lunedì");
        }


    }
}
