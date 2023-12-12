package it.cascella.cloneable;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona(10,"Mirko",new Indirizzo("Morghen","Napoli"),new Indirizzo("S1","S1"),new Indirizzo("S2","S2"),
        new Indirizzo("S3","S3"));
        Persona clone = p.clone();
        int age = clone.getAge();
        System.out.println(age+" "+clone.getIndirizzo().getVia()+" "+clone.getIndirizzo().getCitta());
        System.out.println("-------");
        clone.getIndirizzo().setVia("adsad");
        System.out.println(clone.getIndirizzo().getVia());
        System.out.println(p.getIndirizzo().getVia());
        System.out.println("-------");
        clone.setAge(445);
        clone.setName("Adddrubba");
        System.out.println(clone.getAge()+" "+clone.getName());
        System.out.println(p.getAge()+" "+p.getName());
        System.out.println("--------ASASASASA------");
        for (int i = 0; i < p.getBho().size(); i++) {
            System.out.println(p.getBho().get(i));
            System.out.println(clone.getBho().get(i));
            System.out.println("-------BARABBA------");
        }
        System.out.println("Negr nenenene\n\n");
        clone.getBho().set(2,new Indirizzo("ciao","ciao"));
        for (int i = 0; i < p.getBho().size(); i++) {
            System.out.println(p.getBho().get(i));
            System.out.println(clone.getBho().get(i));
            System.out.println("-------BARABBA------");
        }

        clone.getBho().get(1).setVia("ciaosuuave");
        System.out.println("Negr nenenene\n\n");
        for (int i = 0; i < p.getBho().size(); i++) {
            System.out.println(p.getBho().get(i));
            System.out.println(clone.getBho().get(i));
            System.out.println("-------BARABBA------");
        }
    }
}
