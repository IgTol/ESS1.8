package by.itoverone.StorageSystem_18.service;

import by.itoverone.StorageSystem_18.dao.ItemConverter;
import by.itoverone.StorageSystem_18.dao.ItemDAO;
import by.itoverone.StorageSystem_18.entity.Item;
import by.itoverone.StorageSystem_18.repository.ItemRepository;
import by.itoverone.StorageSystem_18.exception.ValidationException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Objects.isNull;

@Service
@AllArgsConstructor
public class DefaultItemService implements ItemService {
    private final ItemRepository itemRepository;
    private final ItemConverter itemConverter;

    private void validateItemDAO(ItemDAO itemDAO) throws ValidationException {
        if (isNull(itemDAO)) {
            throw new ValidationException("Object item is null");
        }
        if (isNull(itemDAO.getItemName()) || itemDAO.getItemName().isEmpty()) {
            throw new ValidationException("Item name is empty");
        }
    }

    @Override
    public ItemDAO saveItem(ItemDAO itemDAO) throws ValidationException {
        validateItemDAO(itemDAO);
        Item savedItem = itemRepository.save(itemConverter.fromItemDAOToItem(itemDAO));
        return itemConverter.fromItemToItemDAO(savedItem);
    }

    @Override
    public void deleteItem(Integer itemId) {
        itemRepository.deleteById(itemId);
    }

    @Override
    public ItemDAO findByItemName(String itemName) {
        Item item = itemRepository.findByItemName(itemName);
        if (item != null) {
            return itemConverter.fromItemToItemDAO(item);
        }
        return null;
    }

    @Override
    public List<ItemDAO> findAll() {
        
        return null;
    }
}
