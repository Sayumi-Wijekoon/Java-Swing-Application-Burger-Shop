/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgershopoop.controller;

import burgershopoop.model.Customer;
import burgershopoop.model.Item;
import burgershopoop.model.Order;
import burgershopoop.model.OrderItem;
import java.util.ArrayList;

/**
 *
 * @author sayum
 */
public class OrderController {

    private ArrayList<Customer> customerList;
    private ArrayList<Item> itemList;
    private ArrayList<Order> orderList;
    private ArrayList<OrderItem> orderItemList;
    

    public OrderController(ArrayList<Customer> customerList,ArrayList<Item> itemList, ArrayList<Order> orderList,ArrayList<OrderItem> orderItemList) {
        this.customerList = customerList;
        this.itemList = itemList;
        this.orderList = orderList;
        this.orderItemList = orderItemList;
        
            prepopulateBurgerItem();
    }
    
    
    private void prepopulateBurgerItem() {
        if (itemList.isEmpty()) {
            // ID: I001, Name: Burger, Description: Classic, Stock: 9999, Unit Price: Rs. 500/=
            itemList.add(new Item("I001", "Burger", "Classic Burger", 9999, 500.0));
        }
    }
     

   
}
    
    

