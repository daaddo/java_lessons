package it.cascella;

import java.util.*;

public class Mappe{

        public static void main(String[] args) {
            System.out.println("Hello world!");

            //generate a list of books and fill with 5 books

            ArrayList<Book> books = new ArrayList<>();
            books.add(new Book("1984", "Giorgio Orwellone", 268));
            books.add(new Book("1984", "Giorgio Orwellone", 268));

            Set<String> amici = new HashSet<>();
            amici.add("Piero");
            amici.add("Luca");
            amici.add("Piero");

            for (String s : amici) {
                System.out.println("IL MIO AMICO: " + s);
            }


            //mapparci dei servizi che possono essere attivi o no

            //KEY       VALUE
            //backup     true
            //logging    false
            //...

            Map<String, Boolean> serviceMap = new HashMap<>();

            //come inserire valori nella mappa
            serviceMap.put("backup", false);
            serviceMap.put("logging", true);

            //come leggere valori nella mappa
            boolean backupAttivo = serviceMap.get("backup");

            System.out.println("[SERVICE][BACKUP] " + (backupAttivo ? "attivo" : "disattivo"));

            //come listare le chiavi
            Set<String> keys = serviceMap.keySet();
            for (String key : keys) {
                System.out.println("KEY: " + key);
            }

            //come listare i valori
            Collection<Boolean> values = serviceMap.values();
            for (Boolean value : values) {
                System.out.println("Valore: " + value);
            }

            //controllare che la mappa sia vuota
            if (serviceMap.isEmpty()) {
                System.out.println("Mappa vuota");
            } else {
                System.out.println("Mappa non vuota");
            }

            //ciclare tutte le ENTRY  (una entry è una coppia chiave-valore

            Set<Map.Entry<String, Boolean>> entries = serviceMap.entrySet();
            for (Map.Entry<String, Boolean> entry : entries) {
                System.out.println("Entry key:   " + entry.getKey());
                System.out.println("Entry value: " + entry.getValue());
            }


            //dimensione della mappa
            int size = serviceMap.size();

            //svuotare tutta la mappa
            serviceMap.clear();

        }
}
