package it.cascella.inheritance;

public class Fabbrica {

    private String nome;
    private Person capo;

    public Fabbrica(){

    }

    public Fabbrica(String nome, Person capo){
        this.nome = nome;
        this.capo = capo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Person getCapo() {
        return capo;
    }

    public void setCapo(Person capo) {
        this.capo = capo;
    }

    public void ilCapoSaluta(){
        System.out.println(this.capo.hello());
    }
}
