package it.cascella.optionals.step5;

import java.util.Optional;
import java.util.Random;

public class Main {
    public static Optional<Integer> generateNumber(){
        double random = Math.random();

        if (random<0.5) {
            return Optional.ofNullable(null);
        }
        else{

            Optional<Integer> i = Optional.of(new Random().nextInt(10) + 1);
            System.out.println(i.get());
            return i;
        }
    }
    public static void main(String[] args) {
        // in caso il numero sia nullo si ritorni -1
        // se non è null, si stampi "Numero Pari: [n]" se è pari, "Numero dispari[n]" se dispari
        String messaggio = generateNumber()
                .map(num -> num%2 ==0 ?"il numero pari è "+num : "il numero dispari è "+num)
                .orElse( "il numero è null");
        System.out.println(messaggio);
    }
}
