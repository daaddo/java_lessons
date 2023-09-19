package it.cascella.EsDepInj;

public abstract class Person {

    private String name;
    private ItemSelector itemSelectoor;

    public Person(String name, ItemSelector itemSelectoor){
        this.name = name;
        this.itemSelectoor = itemSelectoor;
    }

    public String getName(){
        return name;
    }

    public Item findItem(){
        return itemSelectoor.getRandomItem();
    }

}
