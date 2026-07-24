/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgershopoop.model;

import burgershoputil.OrderStatus;

/**
 *
 * @author sayum
 */
public class Order {
    private String id;
    private String customerId;
    private Date orderDate;
    private OrderStatus orderStatus;

    public Order(String id, String customerId, Date orderDate, OrderStatus orderStatus) {
        this.id = id;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", customerId=" + customerId + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus + '}';
    }
}
