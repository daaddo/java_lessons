package it.cascella.jsons.test4_inheritance;

import it.cascella.Library;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Micio", "Persiano", 3, "Mario");
        Dog dog = new Dog("Fido", "Pastore Tedesco", 5, "Luigi");
        List<Animale> animali = List.of(cat, dog);

        try {
            String jsonAnimals = DataConverter.toJson(animali);
            System.out.println("jsonDog: " + jsonAnimals);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
