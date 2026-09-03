/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgershopoop.controller;

import burgershopoop.model.Customer;
import java.util.ArrayList;

/**
 *
 * @author sayum
 */
public class OrderController {
   // private ArrayList<Customer> sharedList = new ArrayList<>();
//private CustomerFormController customerFormController = new CustomerFormController(sharedList);
    private ArrayList<Customer> customerList;

    public OrderController(ArrayList<Customer> customerList) {
        this.customerList = customerList;
}
}