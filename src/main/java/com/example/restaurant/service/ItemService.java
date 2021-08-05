package com.example.restaurant.service;

import com.example.restaurant.entity.Item;
import com.example.restaurant.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ItemService {
    @Autowired
    ItemRepository itemRepository;

    public List<Item> getAllItems(){
        return itemRepository.findAll();

    }
}
