package it.cascella.genericiAIUTOVIPREGO.esercitazione.second;

public class Main {
    public static void main(String[] args) {
        Pair<String> pair = new Pair<>("Aorro","Subasui");
        System.out.println(pair.getFirst()+"  "+pair.getSecond());
        String bestOne = pair.getBestOne();
        System.out.println(bestOne);
    }
}
