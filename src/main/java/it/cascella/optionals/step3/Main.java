package it.cascella.optionals.step3;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("gino",new Address("Via Leopoldo","perugia"));
        System.out.println("Name person = "+p.getName());
        System.out.println("city person = "+p.getCity().orElse("N/A"));
        System.out.println("Street person = "+p.getStreet().orElse("MAMMETA"));
        
        p.setAddress(null);

        System.out.println("Name person = "+p.getName());
        System.out.println("city person = "+p.getCity().orElse("N/A"));
        System.out.println("Street person = "+p.getStreet().orElse("MAMMETA"));
    }
}
