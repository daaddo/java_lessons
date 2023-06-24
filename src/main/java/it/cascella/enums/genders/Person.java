package it.cascella.enums.genders;

public class Person {
    private String name;
    private String surname;
    private Gender gender;

    public Person(String name, String surname, Gender gender, Generation generation) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.generation = generation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", generation=" + generation +
                '}';
    }

    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

    public Generation getGeneration() {
        return generation;
    }

    private Generation generation;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }
}
