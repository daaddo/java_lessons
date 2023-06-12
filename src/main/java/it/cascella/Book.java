package it.cascella;


public class Book {

    //si definiscono prima gli attributi
    //[SPECIFICATORE DI ACCESSO] [TIPO DELLA VARIABIEL] [NOME DELLA VARIABILE]
    //per la corretta implementazione dell'incapsulamento gli attributi sono sempre privati
    private long id;
    private String title;
    private String author;
    private int page;

    //costruttori
    //è un metodo che risponde a queste caratteristiche
    //1. è in genere pubblico
    //2. il nome del metodo costruttore COINCIDE con il nome della classe
    //3. il metodo costruttore NON HA tipo di ritorno.

    public Book(){  //costruttore vuoto, non perché il body è vuoto ma perché non ha argomenti
        //body
    }

    public Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    //come è possibile che riesco a scrivere due metodi ( i costruttori ) con lo stesso nome ?
    //-> perché hanno argomenti diversi e stanno facendo uso del meccanismo di OVERLOAD di metodi.

    //OVERLOAD SI VERIFICA QUANDO
    //due metodi con lo stesso nome hanno NUMERO o TIPO di argomenti differenti

    public Book(String author, int page){
        this.author = author;
        this.page = page;
    }



    //getter & setter



    //metodi



    public String uppercaseTitle(){  // --> SIGNATURE
        return this.title.toUpperCase();
    }

    public String greetAuthor(String greetings){ // --> SIGNATURE
        return greetings + " " + this.author;
    }


    //override vari (toString, equals, .. )

}
