package it.cascella.paolo;

import it.cascella.Person;

import java.util.ArrayList;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        List<Person> peppe = new ArrayList<>();
        peppe.add(new Person("Peppe", "Peppe", 2));
        peppe.add(new Person("Peppe", "Peppe", 2));
        peppe.add(new Person("Peppe", "Peppe", 3));
        peppe.add(new Person("Peppe", "Peppe", 1));
        peppe.add(new Person("Peppe", "Peppe", 6));
        peppe.add(new Person("Peppe", "Peppe", 6));
        peppe.add(new Person("Peppe", "Peppe", 6));
        peppe.add(new Person("Peppe", "Peppe", 6));
        peppe.add(new Person("Peppe", "Peppe", 6));
        peppe.add(new Person("Peppe", "Peppe", 6));
        peppe.add(new Person("Peppe", "Peppe", 6));
        peppe.add(new Person("Peppe", "Peppe", 6));
        peppe.add(new Person("Peppe", "Peppe", 6));

        List<Integer> indexToRemove = new ArrayList<>();
        for (int i = 0; i < peppe.size(); i++) {
            if (peppe.get(i).getAge() == 2) {
                indexToRemove.add(i);
            }
        }
        for (int i = indexToRemove.size() - 1; i >= 0; i--) {
            peppe.remove(indexToRemove.get(i).intValue());
        }

        /* for (Person i : peppe) {
             if (i.getAge() == 2) {
                 peppe.remove(i);
             }
         }*/

    }

}
