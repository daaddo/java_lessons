package it.cascella.jsons.test3_enum;

public class Telephone {
    // i valori sono Brand e number
    private String brand;
    private String number;

    public Telephone() {

    }

    public Telephone(String brand, String number) {
        this.brand = brand;
        this.number = number;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getNumber() {
        return this.number;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
