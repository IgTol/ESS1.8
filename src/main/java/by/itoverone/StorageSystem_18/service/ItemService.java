package by.itoverone.StorageSystem_18.service;

import by.itoverone.StorageSystem_18.dao.ItemDAO;
import by.itoverone.StorageSystem_18.exception.ValidationException;

import java.util.List;

public interface ItemService {

    ItemDAO saveItem(ItemDAO itemDAO) throws ValidationException;

    void deleteItem(Integer itemId);

    ItemDAO findByItemName(String itemName);

    List<ItemDAO> findAll();
}
