package it.cascella.optionals.step2;

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

    public String getCity(){
        return this.address.getCity();
    }
    public String getStreet(){
        return this.address.getStreet();
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
