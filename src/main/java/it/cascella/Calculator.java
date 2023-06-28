package it.cascella;

public class Calculator {

    public static int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            if(i%2==0){
                continue;
            }
            System.out.println("i = "+i);
        }
    }

}
