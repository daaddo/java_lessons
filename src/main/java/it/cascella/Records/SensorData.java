package it.cascella.Records;

import java.util.Date;

public record SensorData(int value, Date timestamp) {
    public SensorData{
        if (value<0){
            throw new IllegalArgumentException("value <0");
        }
    }
    public void hello(){
        System.out.println("hello");
    }

}
