package it.cascella.enums.genders;

public class Main {
    public static void main(String[] args) {
        Person gino = new Person("Gino","Gini", Gender.INUTILE);

        System.out.println(gino.getName()+" è di sesso: " + gino.getGender());

        System.out.println("The gender of "+gino.getName()+" is " + gino.getGender().getEnglishGender());



    }
}
