package com.example.restaurant.controller;

import com.example.restaurant.entity.Item;
import com.example.restaurant.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ItemController {
    @Autowired
    ItemService itemService;

    @RequestMapping(method = RequestMethod.GET, value = "/getitems")
    public List<Item> getAllItem(){
        return itemService.getAllItems();

    }
}
