package it.cascella.jsons.test5_recursive;

import com.fasterxml.jackson.core.JsonProcessingException;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Mario", "Rossi");
        Car car = new Car(person, "Fiat Panda");
        person.addCar(car);

        Person person2 = new Person("Luigi", "Verdi");
        Car car2 = new Car(person2, "Fiat Punto");
        person2.addCar(car2);
        person.addCar(car2);
        String json = """
                {
                  "name" : "Mario",
                  "surname" : "Rossi",
                  "cars" : [ {
                    "model" : "Fiat Panda"
                  }, {
                    "model" : "Fiat Punto"
                  } ]
                }""";


        System.out.println(json);
        try {
            Person person3 = DataConverter.fromJson(json, Person.class);
            System.out.println(person3.getName());
            System.out.println(person3.getCars().get(0).getModel());
            System.out.println(person3.getCars().get(1).getOwner().getName());
        } catch (JsonProcessingException e) {
            e.printStackTrace() ;
        }
    }
}
