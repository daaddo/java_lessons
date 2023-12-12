package it.cascella.jsons.test3_enum;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;

public class Person {
    @JsonSerialize(nullsUsing = CustomNullSerializer.class)
    private String name = "FILoppio";
    private String surname;
    private int age;

    private Gender gender;
    private List<Telephone> telephones;
    private Address address;

    public Person() {
    }

    public Person(String name, String surname, int age, Gender gender, List<Telephone> telephones, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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
