package it.cascella;


public class Book {

    //si definiscono prima gli attributi
    //[SPECIFICATORE DI ACCESSO] [TIPO DELLA VARIABIEL] [NOME DELLA VARIABILE]
    //per la corretta implementazione dell'incapsulamento gli attributi sono sempre privati
    private long id;
    private String title;
    private String author;
    private int page;

    public static final String DEFAULT_TITLE = "titolo di default";

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
    //metodi pubblici che mi permettono di accedere agli attributi privati della classe
    //getter --> mi permette di leggere il valore di un attributo
    //setter --> mi permette di modificare il valore di un attributo

    //getter
    public String getTitle(){
        return this.title;
    }

    public  String getAuthor(){
        return this.author;
    }

    public int getPage(){
        return this.page;
    }
    //setter

    public void setTitle(String title){
        if (title.isEmpty() || title.isBlank()){
            this.title = DEFAULT_TITLE;
        }
        else {
            this.title = title;
        }
    }

    public void setAuthor(String author){
        if(author.isEmpty() || author.isBlank()){
            this.author = DEFAULT_TITLE;
        }
        else {
            this.author = author;
        }
    }

    public void setPage(int page){
        this.page= page;
    }
    //metodi



    public String uppercaseTitle(){  // --> SIGNATURE
        return this.title.toUpperCase();
    }

    public String greetAuthor(String greetings){ // --> SIGNATURE
        return greetings + " " + this.author;
    }

    public void merge(Book that){
        this.title = this.title + that.title;
        this.page= this.page + that.page;
    }
    //override vari (toString, equals, .. )
    public String contrario(String author){
        String a = "";
        for(int i=0;i<author.length();i++){
            a=author.charAt(i)+a;
        }
        return a;
    }
    public String vocali(String author){
        String a= "";
        for(int i=0;i<author.length();i++){
            char c = author.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                a=a+c;
            }
        }
        return a;
    }
}












