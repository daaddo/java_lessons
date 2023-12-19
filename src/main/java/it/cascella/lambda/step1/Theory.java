package it.cascella.lambda.step1;

import it.cascella.lambda.step1.impl.Demo;
import it.cascella.lambda.step1.impl.MyLogger;

import java.util.List;

public class Theory {
    //meccanismo per implementare la programmazione funzionale in Java
    //da java 8 in poi è possibile implementare la programmazione funzionale in Java tramite le lambda expression
    //la programmazione funzionale è un paradigma di programmazione basato sul concetto di funzione

    //l altro tipo di programmazione è la programmazione imperativa, basata sul concetto di istruzione

    //ad esempio
    //int a = 1;
    //int b = 2;
    //int c = a + b;

    //le functional interface sono interfacce che hanno un solo metodo astratto
    public static void main(String[] args) {
        List<String> a = List.of("a", "b", "c");

        for (String s : a) {
            System.out.println(s);
        }

        //scorrimento funzionale
        a.forEach(s -> System.out.println(s));

        MyLogger myLogger = new MyLogger();
        myLogger.print("ciao");

        Demo demo = new Demo();
        demo.demo(new Printer() {
            @Override
            public void print(String s) {
                System.out.println("Anonymous: " + s);
            }
        }, "ciao");
        //la lambda expression è una funzione anonima
        //è una funzione perchè ha un input e un output
        //è anonima perchè non ha un nome

        demo.demo((String s) -> System.out.println("Lambda: " + s), "ciao");

        //              f: x -> x + 1

        //y = f(x) = x + 1

        //una lambda expression è composta da:
        //1) una lista di parametri
        //2) una freccia che si chiama lambda operator
        //3) un corpo
        //4) un tipo di ritorno (opzionale)

        //se il corpo della funzione è composto da una sola istruzione, non è necessario usare le parentesi graffe
        //se il corpo della funzione è composto da una sola istruzione, non è necessario usare la keyword return
        //se è composto da più istruzioni, è necessario usare le parentesi graffe
        demo.demo((String s) -> {
            System.out.println("Lambda: " + s);
            System.out.println("Lambda: " + s);
        }, "ciao");
        //se la lista dei parametri è composta da un solo parametro, non è necessario usare le parentesi tonde
        //se la lista dei parametri è composta da un solo parametro, non è necessario usare il tipo del parametro
        demo.demo(s -> System.out.println("Lambda: " + s), "ciao");
        //se la lista dei parametri è vuota, è necessario usare le parentesi tonde
        Thread t = new Thread(() -> System.out.println("ciao"));
        t.start();
    }

}
