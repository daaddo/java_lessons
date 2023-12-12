package it.cascella.optionals.step3;

import java.util.Optional;

public class Person {
    private String name ;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getCity(){
        return Optional.ofNullable(address).map(Address::getCity); //method reference
    }
    public Optional<String> getStreet(){
        return Optional.ofNullable(address).map(Address::getStreet).map(String::toUpperCase);
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
