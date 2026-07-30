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
public class CustomerFormController {
   ArrayList<Customer> customerList = new ArrayList<>();
   
   public boolean addCustomer(Customer customer){
       customerList.add(customer);
       return true;
   
   }
}


