package it.cascella.EsDepInj;

import java.util.List;

public class ItemsManager {
    public enum ItemSelector{
        ALL,
        SAMURAI,
        GUERRIERO;
    }
    //implements singleton pattern

    private static ItemsManager instance;

    private ItemsManager(){

    }

    public static ItemsManager getInstance(){
        if(instance == null){
            instance = new ItemsManager();
        }
        return instance;
    }

    public List<Item> getAllItems(ItemSelector selector){
        return switch (selector){
            case ALL ->  DatabaseManager.getInstance().getAllItems();
            case SAMURAI -> DatabaseManager.getInstance().getSamuraiItems();
            case GUERRIERO -> DatabaseManager.getInstance().getGuerrieroItems();
        };
    }
}