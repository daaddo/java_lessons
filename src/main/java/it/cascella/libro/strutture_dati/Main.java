package it.cascella.libro.strutture_dati;

import it.cascella.patterns.command.step2.Light;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("ciao1");
        list.add("cia");
        list.add("ciaociao");
        //compare strings lenght
        Collections.sort(list, ((String s1, String s2)-> s2.length() - s1.length()));
        System.out.println(list);


        //Sets
        String primonome ="Luca";
        String secondonome = "Marco";
        String terzonome = "Giovanni";

        HashSet<String> set = new HashSet<>();
        set.add(primonome);
        set.add(secondonome);
        set.add(terzonome);

        //proviamo ad aggiungere un duplicato

        set.add(primonome);

        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("-------------------");
        //hashset non tiene conto del ordine di inserimento
        HashSet<String> set2 = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set2.add("a"+i+" ");
        }
        for (String integer : set2) {
            System.out.println(integer);
        }

        //TreeSet
        //la tree set tiene conto dell'ordine di inserimento e ordina gli elementi in base al compareTo dell'oggetto inserito
        //SE SI MODIFICA IL COMPARATOR SI MODIFICA ANCHE LA PROPRIETà DI DUPLICATI DUE ELEMENTI SONO DIVERSI SE IL COMPARATOR è DIVERSO
        TreeSet<String> treeSet = new TreeSet<>((s1, s2)->s2.length()-s1.length());
        treeSet.add("c");
        treeSet.add("adasd");
        treeSet.add("db");
        treeSet.add("ddsadad");
        treeSet.add("ddsrrrr");
        for (String s : treeSet) {
            System.out.println(s);
        }
        System.out.println("-------------------");

        //di default ordina in base al compareTo dell'oggetto inserito
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("alfredo");
        treeSet2.add("giovanni");
        treeSet2.add("marco");
        treeSet2.add("luca");
        for (String s : treeSet2) {
            System.out.println(s);
        }

    }



}
