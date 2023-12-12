package it.cascella.calcolatempo;

public class Sommatoria {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i <= 960; i++) {
            if (i % 5 != 0) {
                a = i;
            } else {
                i--;
            }
        }
        System.out.println(a);
    }
}
