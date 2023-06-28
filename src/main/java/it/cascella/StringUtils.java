package it.cascella;

import java.util.LinkedList;
import java.util.List;

public class StringUtils {

    public static void main(String[] args) {

        String p1 = "Luca Coraci";
        String p2 = "Mario Rossi";
        String p3 = "Gino Verdi";

        String fraseBrutta = "Ciao, %come% stai?";
        System.out.println(fraseBrutta);
        System.out.println(fraseBrutta.replaceAll("%",""));

        List<String> parole = new LinkedList<>();
        parole.add(p1);
        parole.add(p2);
        parole.add(p3);

        //for each:
        //for (tipo nomeVariabile : nomeLista) {
        for (String x : parole) {
            System.out.println("Nome: " + getNomeByFullName(x));
            System.out.println("Cognome: " + getCognomeByFullName(x));
        }
    }

    public static String getNomeByFullName(String fullName){
        String[] splittato = fullName.split(" ");
        return splittato[0];
    }

    public static String getCognomeByFullName(String fullName){
        String[] splittato = fullName.split(" ");
        return splittato[1];
    }

    public boolean isNameValid(String fullName){
        return fullName.matches("[A-Z][a-z]+\s[A-Z][a-z]+");
    }

}
