package it.cascella;

public class Library {
    private String nome;
    private String indirizzo;
    private Book bestBook;
    public static final String DEFAULT_EMPTY = "unknown";
    public Library(){} //costruttore di default

    public Library(String nome, String indirizzo, Book bestBook){
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.bestBook = bestBook;
    }

    public String getNome() {
        return this.nome;
    }
    public String getIndirizzo(){
        return this.indirizzo;
    }
    public Book getBestBook(){
        return this.bestBook;
    }

    public void setNome(String nome){
        if(nome.isEmpty() || nome.isBlank()){
            this.nome = "falagio";
        }
        else {
            this.nome = nome;
        }
    }

    public void setIndirizzo(String indirizzo){
        if(indirizzo.isEmpty() || indirizzo.isBlank()){
            this.indirizzo = DEFAULT_EMPTY;
        }
        else {
            this.indirizzo = indirizzo;
        }
    }
    public void setBestBook(Book bestBook){
        if(bestBook.getTitle().equals(DEFAULT_EMPTY) || bestBook.getAuthor().equals(DEFAULT_EMPTY)){
            System.out.println("bro che scrivi scus");
        }
        else {
            this.bestBook = bestBook;
        }
    }
}
