package it.cascella.inheritance;

public final class Schiavo extends Person{

    private int slaveryYears;

    public Schiavo(){
        super();
    }

    public Schiavo(String name, String surname, int age, int slaveryYears) {
        super(name, surname, age);
        this.slaveryYears = slaveryYears;
    }

    public int getSlaveryYears() {
        return slaveryYears;
    }

    public void setSlaveryYears(int slaveryYears) {
        this.slaveryYears = slaveryYears;
    }

    public String hello(){
        return "Hello, I'm " + this.getName() + " " + this.getSurname() + " and I'm a slave since " + this.slaveryYears;
    }

    @Override
    public void printQualcosa(int x) {
        System.out.println("Schiavo: " + x);
    }
}
