package it.cascella.EsDepInj;

import java.util.List;

public class SamuraiNormalSelector extends SamuraiItemSelector{
    @Override
    public List<Item> getItems() {
        List<Item> allItems = ItemsManager.getInstance().getAllItems(ItemsManager.ItemSelector.SAMURAI);
        allItems.remove(0);

        return allItems;
    }
}
