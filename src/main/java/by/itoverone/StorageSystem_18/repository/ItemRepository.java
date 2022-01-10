package by.itoverone.StorageSystem_18.repository;

import by.itoverone.StorageSystem_18.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
        Item findByItemName(String itemName);
}
