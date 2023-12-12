package it.cascella.jsons.test5_recursive;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.ArrayList;
import java.util.List;

public class Person {

    //name surname and list of cars
    private String name;
    private String surname;
    @JsonManagedReference
    private List<Car> cars = new ArrayList<>();

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void addCar(Car car) {
        cars.add(car);
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
