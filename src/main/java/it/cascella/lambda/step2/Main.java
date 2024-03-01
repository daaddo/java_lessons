package it.cascella.lambda.step2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OperazioneMatematica somma = (int a,int  b) -> {return a + b;};
        OperazioneMatematica sottrazione = (a, b) -> a - b;
        OperazioneMatematica moltiplicazione = (a, b) -> a * b;
        OperazioneMatematica divisione = (a, b) -> a / b;

        /*System.out.println("Somma: " + somma.esegui(10, 5));
        System.out.println("Sottrazione: " + sottrazione.esegui(10, 5));
        System.out.println("Moltiplicazione: " + moltiplicazione.esegui(10, 5));
        System.out.println("Divisione: " + divisione.esegui(10, 5));

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1");
            }
        });

        t1.start();
        Thread t2 = new Thread(()-> System.out.println("Thread 2")) ;
        t2.start();
*/


       /* List<String> parole = Arrays.asList("wsefcane", "gatto", "elefante", "tifefefgre");

        Collections.sort(parole, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
        parole.sort(
                (String s1, String s2)-> Integer.compare(s2.length(),s1.length())
        );
        System.out.println(parole);
*/

        Display display = new Display(
                new WelcomeMessenger() {
                    @Override
                    public String generateWelcomeMessage(String name) {
                        return "Benvenuto " + name;
                    }
                },
                new AlarmMessenger() {
                    @Override
                    public String generateAlarmMessage(String name, int level) {
                        return "Attenzione " + name + ", livello " + level;
                    }
                }
        );

        display.displayWelcomeMessage("Mario");
        display.displayAlarmMessage("Fumo in stanza!", 1);

        Display display1 = new Display(
                name->  "Benvenuto" + name,
                (name, level)->  "Attenzione" + name +", livello "+ level
        );
        display1.displayWelcomeMessage("ti odio");
        display1.displayAlarmMessage("ti odio", 34324);
    }
}
