package it.cascella.jsons.test5_recursive;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class Car {
    //name e model
    @JsonBackReference
    private Person owner;
    private String model;

    public Car() {
    }

    public Car(Person owner, String model) {
        this.owner = owner;
        this.model = model;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }
}
