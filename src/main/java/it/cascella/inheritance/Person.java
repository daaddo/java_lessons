package it.cascella.inheritance;

public sealed abstract class Person permits Lavoratore, Schiavo {

    private String name;
    private String surname;
    private int age;


    public Person() {

    }

    public Person(String name, String surname, int age) {
        setName(name);
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
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

    public String hello(){
        return "Hello, I'm " + this.name + " " + this.surname;
    }

    public abstract void printQualcosa(int x);

}
