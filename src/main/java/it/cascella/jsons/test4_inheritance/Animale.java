package it.cascella.jsons.test4_inheritance;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Dog.class, name = "Cane Class"),
        @JsonSubTypes.Type(value = Cat.class, name = "Gatto Class")
})
public class Animale {
    private String nome;
    private String razza;
    private int eta;

    public Animale() {
    }

    public Animale(String nome, String razza, int eta) {
        this.nome = nome;
        this.razza = razza;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public String getRazza() {
        return razza;
    }

    public int getEta() {
        return eta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
}
