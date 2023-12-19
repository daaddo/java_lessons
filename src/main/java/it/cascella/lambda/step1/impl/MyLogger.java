package it.cascella.lambda.step1.impl;

import it.cascella.lambda.step1.Printer;

public class MyLogger implements Printer {

    @Override
    public void print(String s) {
        System.out.println("MyLogger: " + s);
    }
}
