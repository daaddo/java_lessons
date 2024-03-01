package it.cascella.serializable;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Unit unit = new Unit("Unit 1");
        unit.setSerializationTime("2020-01-01 00:00:00");
        System.out.println(unit);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("unit.ser"))) {
            oos.writeObject(unit);
            System.out.println("Unit serialized");
        } catch (IOException e) {
            e.printStackTrace();

        }

        //deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("unit.ser"))) {
            Unit unit2 = (Unit) ois.readObject();
            System.out.println(unit2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
