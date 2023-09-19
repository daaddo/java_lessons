package it.cascella.EsDepInj;

public class Main {


    public static void main(String[] args) {
        Samurai samurai = new Samurai("Samurai",new SamuraiNormalSelector());
        Item item = samurai.findItem();
        System.out.println(item);

    }
}
