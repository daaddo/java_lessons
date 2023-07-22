package it.cascella.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Person p = new Person("Mario", "Rossi", 30);
//        System.out.println(p.getName());
//
//        Lavoratore l = new Lavoratore("Mario", "Rossi", 30, "schiavo");
//
//        System.out.println(l.getName());
//
//        if(l instanceof Lavoratore){
//            System.out.println("Lavoratore");
//        }
//
//        System.out.println("PERSON: \t\t"+p.hello());
//        System.out.println("LAVORATORE: \t"+l.hello());
//
//        l.setName("");
//
//        System.out.println("LAVORATORE: \t"+l.hello());


        List<Person> people = new ArrayList<>();
        // people.add(new Person("Mario", "Rossi", 30));
        people.add(new Lavoratore("Mario", "Rossi", 30, "schiavo"));
        people.add(new Schiavo("Mario", "Rossi", 30, 10));
        people.add(new Lavoratore("Gino", "Rossi", 16, "schiavo"));
        people.add(new Lavoratore("Verduro", "Rossi", 23, "schiavo"));

        Person p2 = new Lavoratore();

        System.out.println(">>> " + p2.getClass().getSimpleName());

        int sumLavoratoreAge = 0;
        for (Person p : people) {
            System.out.println(p.hello());
            if (p instanceof Lavoratore) {
                sumLavoratoreAge += p.getAge();
            }
           p.printQualcosa(3);
        }

        System.out.println("Sum of Lavoratore age: " + sumLavoratoreAge);


    }
}
