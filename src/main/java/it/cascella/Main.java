package it.cascella;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
        Frazione a = new Frazione(3, 5);
        Frazione b = new Frazione(4, 7);
        /*a.sum(b);
        System.out.println(a);
        a.simplify();
        System.out.println(a);*/
        a.moltiplicazione(b);
        System.out.println(a);


        //---- MOMENTO LISTE ----
        List<Book> libri = new ArrayList<>();
        libri.add(book);

        List<Book> libri2 = new LinkedList<>();
        libri2.add(book);

        //cancellare tutta la lista
        libri.clear();

        //cancellare un elemento
        libri.remove(book); //questo funziona se hai implementato il metodo equals nella classe Book

        //cancellare un elemento in base all'indice
        libri.remove(0); //attenzione che se l'indice non esiste, ti da' un errore

        //verificare se la lista contiene o no un elemento
        libri.contains(book); //questo funziona se hai implementato il metodo equals nella classe Book

        //verificare se la lista è vuota
        boolean vuota = libri.isEmpty();

        //esempio di estrazione di un elemento dalla lista
        Book primoLibro = libri.get(0);

        //esempio di for each
        for (Book libro : libri) {
            System.out.println(libro.getTitle());
        }

        //esempio di for each con un array
        int[] numeri = {1, 2, 3, 4, 5};
        for (int numero : numeri) {
            System.out.println(numero);
        }

    }

}