package it.cascella.EsDepInj;

import java.util.List;

public class DatabaseManager {
    //singleton con tutti gli item
    private static DatabaseManager instance;

    private DatabaseManager(){

    }

    public static DatabaseManager getInstance(){
        if(instance == null){
            instance = new DatabaseManager();
        }
        return instance;
    }
    public List<Item> getSamuraiItems(){
        //questa è una lista immutabile perchè è creata con List.of
        return List.of(new Item(),new Item(),new Item(),new Item(),new Item());
    }
    public List<Item> getAllItems(){
        //questa è una lista immutabile perchè è creata con List.of
        return List.of(new Item(),new Item(),new Item(),new Item(),new Item(),new Item());
    }

    public List<Item> getGuerrieroItems() {
        return List.of(new Item(),new Item(),new Item(),new Item(),new Item());
    }
}
