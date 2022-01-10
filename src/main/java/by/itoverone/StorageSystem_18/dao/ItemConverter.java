package by.itoverone.StorageSystem_18.dao;

import by.itoverone.StorageSystem_18.entity.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemConverter {
    public Item fromItemDAOToItem(ItemDAO itemDAO) {
        Item item = new Item();
        item.setItemId(itemDAO.getItemId());
        item.setItemName(itemDAO.getItemName());
        item.setItemEAN(itemDAO.getItemEAN());
        item.setItemQuality(itemDAO.getItemQuality());
        item.setItemPrice(itemDAO.getItemPrice());
        return item;
    }

    public ItemDAO fromItemToItemDAO(Item item) {
        return ItemDAO.builder()
                .itemId(item.getItemId())
                .itemName(item.getItemName())
                .itemEAN(item.getItemEAN())
                .itemQuality(item.getItemQuality())
                .itemPrice(item.getItemPrice())
                .build();
    }
}
