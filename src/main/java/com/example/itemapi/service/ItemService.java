//package com.example.itemapi.service;
//
//import com.example.itemapi.model.Item;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class ItemService {
//
//    private final List<Item> itemList = new ArrayList<>();
//    private Long idCounter = 1L;
//
//    public Item addItem(Item item) {
//        item.setId(idCounter++);
//        itemList.add(item);
//        return item;
//    }
//
//    public Optional<Item> getItemById(Long id) {
//        return itemList.stream()
//                .filter(item -> item.getId().equals(id))
//                .findFirst();
//    }
//}
package com.example.itemapi.service;

import com.example.itemapi.model.Item;
import com.example.itemapi.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    // In-memory storage
    private final List<Item> itemList = new ArrayList<>();

    // ID counter
    private Long idCounter = 1L;

    // Add new item
    public Item addItem(Item item) {
        item.setId(idCounter);   // assign id
        idCounter++;             // increment counter
        itemList.add(item);
        return item;
    }

    // Get item by ID
    public Item getItemById(Long id) {
        return itemList.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst()
                .orElseThrow(() ->
                        new ResourceNotFoundException("Item not found with id: " + id));
    }

    // Get all items
    public List<Item> getAllItems() {
        return itemList;
    }
}
 