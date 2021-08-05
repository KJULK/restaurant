package com.example.restaurant.controller;

import com.example.restaurant.entity.Order;
import com.example.restaurant.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    OrdersService ordersService;

    @PostMapping
    public Order saveOrders(@RequestBody Order order){
       return ordersService.saveOrders(order);

    }

    @GetMapping
    public List<Order> getAllOrders(){
       return ordersService.getAllOrders();

    }

    @GetMapping(value = "/{id}")
    public Order getOrder(@PathVariable Integer orderId){
        return ordersService.getOrder(orderId);

    }

    @GetMapping(value = "/table/{tableNumber}")
    public Order getOrderItem(@PathVariable Integer tableNumber){
        return ordersService.getOrderItem(tableNumber);

    }
}
