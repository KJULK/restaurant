package com.example.restaurant.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    public Order()
    {
    }
    @Column(name = "order_number")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderNumber;

    @NotNull
    @Column(name = "table_number")
    private Integer tableNumber;

    @Column(name = "order_name")
    private String orderName;

    @Column(name = "total_price")
    private Double totalPrice;

    @Column(name = "order_date")
    private Date orderDate;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "order_number")
    private List<OrderItem> orderItem;

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<OrderItem> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(List<OrderItem> orderItem) {
        this.orderItem = orderItem;
    }
}
