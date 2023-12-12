package it.cascella.cloneable;

import java.util.*;
import java.util.stream.Collectors;

public class Persona implements Cloneable{
    private int age;
    private List<Indirizzo> bho = new ArrayList<>();
    private String name;
    private Indirizzo indirizzo;

    public Persona(int age, String name, Indirizzo indirizzo,Indirizzo ... strings) {
        this.age = age;
        this.name = name;
        this.indirizzo = indirizzo;
        bho.addAll(Arrays.asList(strings));
    }

    public List<Indirizzo> getBho() {
        return bho;
    }

    public void setBho(List<Indirizzo> bho) {
        this.bho = bho;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Indirizzo getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(Indirizzo indirizzo) {
        this.indirizzo = indirizzo;
    }

    @Override
    public Persona clone() {
        try {
            Persona clone = (Persona) super.clone();
            Indirizzo clonedAddress = this.indirizzo.clone();
            clone.setIndirizzo(clonedAddress);
            clone.setBho(new ArrayList<>());
            for (Indirizzo indirizzo1 : bho) {
                clone.getBho().add(indirizzo1.clone());
            }
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
