package it.cascella.jsons.test1;

public class Person {
    private String name = "FILoppio";
    private String surname;
    private int age;

    public Person() {

    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        if (name == null) {
            return;
        }
        if ( name.equals("Mirko")){
            this.name = "MARIO";
            return;
        }
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
