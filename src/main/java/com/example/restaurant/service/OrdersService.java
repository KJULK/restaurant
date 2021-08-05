package com.example.restaurant.service;

import com.example.restaurant.entity.Order;
import com.example.restaurant.entity.OrderItem;
import com.example.restaurant.repository.OrderItemRepository;
import com.example.restaurant.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
public class OrdersService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    public Order saveOrders(Order orderReq){
        Order order = orderRepository.saveAndFlush(orderReq);
        return  order;
    }

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public Order getOrder(Integer orderId) {
        return orderRepository.findById(orderId).get();
    }

    public Order getOrderItem(Integer tableNumber){
        return orderRepository.findByTableNumber(tableNumber);
    }

}
