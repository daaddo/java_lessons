package it.cascella.inheritance;

public class Lavoratore extends Person{

    private String work;

    public Lavoratore(){
        super();
    }

    public Lavoratore(String name, String surname, int age, String work) {
        super(name, surname, age);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public void setName(String name){
        if(name.isEmpty()){
            super.setName("AHAHAH");
        }
        else {
            super.setName(name);
        }
    }

    @Override
    public String hello(){
        return "Hello, I'm " + this.getName() + " " + this.getSurname() + " and I'm a " + this.work;
    }

    @Override
    public void printQualcosa(int x) {
        System.out.println("Lavoratore: " + x);
    }
}
