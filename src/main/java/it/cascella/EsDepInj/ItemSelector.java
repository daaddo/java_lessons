package it.cascella.EsDepInj;
import java.util.List;

public interface ItemSelector {

    List<Item> getItems();

    Item getRandomItem();
}

