package it.cascella.jsons.test2;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;

public class Person {
    @JsonSerialize(nullsUsing = CustomNullSerializer.class)
    private String name = "FILoppio";
    private String surname;
    private int age;
    private List<Telephone> telephones;
    private Address address;

    public Person() {
    }

    public Person(String name, String surname, int age, List<Telephone> telephones, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.telephones = telephones;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Telephone> getTelephones() {
        return telephones;
    }

    public void setTelephones(List<Telephone> telephones) {
        this.telephones = telephones;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
