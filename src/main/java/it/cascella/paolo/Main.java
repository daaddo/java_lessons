package it.cascella.paolo;

public class Main {
    //replica forza4
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //crea forza 4 tramite matrici che però non tiene conto delle vittorie in trasversale
        Persona[][] forza4 = new Persona[6][7];
        //crea giocatori
        Persona p1 = new Persona("Paolo", "Cascella", 0, 0);
        Persona p2 = new Persona("Giovanni", "Cascella", 0, 0);
        //crea giocatore attuale
        Persona attuale = p1;
        //crea contatore turni
        int turni = 0;
        //crea contatore colonne
        int colonne = 0;
        //crea contatore righe
        int righe = 0;
        //crea contatore vittorie
        int vittorie = 0;
        //crea contatore sconfitte
        int sconfitte = 0;

        //fammi un ciclo che stampi la matrice forza4
        for (Persona[] riga : forza4) {
            for (Persona colonna : riga) {
                if (colonna == null) {
                    System.out.print("0 ");
                } else {
                    System.out.print(colonna.getNome() + " ");
                }
            }
            System.out.println();
        }
        System.out.println("è il turno di " + attuale.getNome());
    }

}
