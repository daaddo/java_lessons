package it.cascella.lambda.step3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    private static void printhello(){
        System.out.println("Thread 1");
    }

    public static void main(String[] args) {

        Thread t2 = new Thread(()-> System.out.println("Thread 1"));
        Thread t3 = new Thread(()-> System.out.println("Thread 1"));
        Thread t4= new Thread(Main::printhello);
    }
}
