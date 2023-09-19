package it.cascella.Records;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date a = new Date();
        SensorData d1 = new SensorData(-3,a);
        SensorData d2 = new SensorData(1,a);
        System.out.println(d1.value()+"\nasdrubba\n"+d1.timestamp());
        if (d1.equals(d2)){
            System.out.println("sium");
        }
    }
}
