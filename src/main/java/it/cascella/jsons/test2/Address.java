package it.cascella.jsons.test2;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Address {
    private String street;
    private String city;

    private String state;
    @JsonIgnore
    private String zip = "00000";

    public Address() {

    }

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state= state;
        this.zip = zip;
    }

    public String getStreet() {
        return this.street;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getZip() {
        return this.zip;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
