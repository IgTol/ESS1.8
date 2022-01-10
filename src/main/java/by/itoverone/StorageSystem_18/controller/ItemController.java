package by.itoverone.StorageSystem_18.controller;

import by.itoverone.StorageSystem_18.dao.ItemDAO;
import by.itoverone.StorageSystem_18.service.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
@AllArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @PostMapping("/save")
    public ItemDAO saveItem(@RequestBody ItemDAO itemDAO) throws by.itoverone.StorageSystem_18.exception.ValidationException {
        return itemService.saveItem(itemDAO);
    }

    @GetMapping("/findAll")
    public List<ItemDAO> findAllItem() {
        return itemService.findAll();
    }

    @GetMapping("/findByItemName")
    public ItemDAO findByItemName(@RequestParam String itemName) {
        return itemService.findByItemName(itemName);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable Integer id) {
        itemService.deleteItem(id);
        return ResponseEntity.ok().build();
    }
}
