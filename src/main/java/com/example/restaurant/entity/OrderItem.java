package com.example.restaurant.entity;

import javax.persistence.*;

@Entity
@Table(name="orderitem")
public class OrderItem {

    @Column(name = "order_item_id")
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer orderItemId;

    @Column(name = "item_id")
    private Integer itemId;

    public OrderItem() {}

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }


}
