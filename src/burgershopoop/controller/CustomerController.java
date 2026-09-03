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
public class CustomerController {
 //  ArrayList<Customer> customerList = new ArrayList<>();
    
    private ArrayList<Customer> customerList;

    public CustomerController(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
   
   public boolean addCustomer(Customer customer){
       customerList.add(customer);
       return true;
   
   }
   
   public boolean updateCustomer(Customer customer){
        for(int i=0;i < customerList.size();i++){
            if(customerList.get(i).getId().equals(customer.getId())){
                customerList.set(i, customer);
                return true;
        }
        }
         return false;
   }
   
   public boolean deleteCustomer(Customer customer){
         for(int i=0;i < customerList.size();i++){
            if(customerList.get(i).getId().equals(customer.getId())){
                customerList.remove(i);
                return true;
        }
        }
         return false;
   }
   
}


