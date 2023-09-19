package it.cascella.EsDepInj;

import java.util.List;

public abstract class SamuraiItemSelector implements ItemSelector{
    @Override
    public List<Item> getItems() {
        List<Item> allItems = ItemsManager.getInstance().getAllItems(ItemsManager.ItemSelector.SAMURAI);
        return allItems;
    }

    @Override
    public Item getRandomItem() {
        return null;
    }
}