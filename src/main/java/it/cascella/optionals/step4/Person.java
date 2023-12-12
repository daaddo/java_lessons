package it.cascella.optionals.step4;

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
    public String getFullAddress(){
        //mi deve stampare città e via, concatenati e separati da una virgola
        //ad ex. Roma,Via delle Minchiette
        //In caso address sia null bisogna lanciare un eccezione
        return this.getCity()
                .orElseThrow(() -> new RuntimeException("La mia eccezione"))
                +", "
                +this.getStreet()
                .orElseThrow(() -> new RuntimeException("La mia eccezione"))
                ;
    }
    public String getFullAddress2(){
        //mi deve stampare città e via, concatenati e separati da una virgola
        //ad ex. Roma,Via delle Minchiette
        //In caso address sia null bisogna lanciare un eccezione
        return Optional.ofNullable(address)
                .map(addr -> addr.getCity() + ", "+ addr.getStreet())
                .map(addr -> addr+" ciao")
                .orElseThrow(()-> new RuntimeException("aiuto"));
    }
    public void setAddress(Address address) {
        this.address = address;
    }
}
