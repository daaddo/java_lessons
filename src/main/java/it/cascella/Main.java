package it.cascella;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        //[TIPO DELLA CLASSE] [NOME DELL'OGGETTO]  =  new [METODO COSTRUTTORE]
        Book book  = new Book("1984","Giorgio Orwellone",268);

        System.out.println("Il libro si intitola: " + book.getTitle());

        //carica soldi
        book.setTitle("");

        System.out.println("Il libro si intitola: " + book.getTitle());

        System.out.println("Se non metti il titolo, il libro si intitola: " + Book.DEFAULT_TITLE);
        book.contrario("Giorgio orwellone");
        System.out.println(""+book.contrario("Giorgio orwellone"));
        System.out.println(""+book.vocali("Giorgio orwellone"));
    }
}