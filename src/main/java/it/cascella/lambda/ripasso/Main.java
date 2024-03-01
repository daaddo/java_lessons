package it.cascella.lambda.ripasso;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1");
            }
        });
        Thread t2 = new Thread(()-> System.out.println("kitemmuo"));


        List<String> parole = Arrays.asList("cane", "gatto", "elefante", "tigre");
        Collections.sort(parole, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
        Collections.sort(parole, (s1,s2)-> Integer.compare(s1.length(), s2.length()));

    }
}
