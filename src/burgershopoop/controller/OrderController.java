/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgershopoop.controller;

import burgershopoop.model.Customer;
import burgershopoop.model.Item;
import burgershopoop.model.Order;
import burgershopoop.model.OrderItem;
import burgershopoop.controller.CustomerController;
import java.util.ArrayList;
import burgershoputil.OrderStatus;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


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
     
    public String generateNextOrderId(){
    if (orderList == null || orderList.isEmpty()){
        return "O001";
    }
    
    Order lastOrder = orderList.get(orderList.size()-1);
    
    String lastId = lastOrder.getOrderId();
    
    try{
        
        int lastNum = Integer.parseInt(lastId.substring(1));
        
        return String.format("O%03d",lastNum +1);
    }catch (NumberFormatException e){
        return String.format("O%03d", orderList.size()+1);
    }
    }
    
    public String generateNextCustomerId(){
        
        if(customerList == null || customerList.isEmpty()){
            return "C001";
        }
        
         Customer lastCustomer = customerList.get(customerList.size()-1);
        
         String lastId = lastCustomer.getCustomerId(); 
        
        try{
            int lastNum = Integer.parseInt(lastId.substring(1));
            
            return String.format("C%03d", lastNum +1);
            
        }catch (NumberFormatException e){
        return String.format("C%03d", customerList.size()+1);
    }
    }
    
    public Customer findCustomerById(String customerId){ 
            for(Customer customer: customerList){
                if(customer.getCustomerId().equalsIgnoreCase(customerId)){
                    return customer;
                }
            }
            return null;
    }
    
   public boolean placeOrder(String orderId, String customerId, String customerName, int qty, double unitPrice, OrderStatus status) {
       try{
           Customer newCustomer = new Customer(customerId,customerName,"","");
           customerList.add(newCustomer);
           
           Order newOrder = new Order(orderId, customerId,new java.util.Date(), status);
           orderList.add(newOrder);
           
           String orderItemId = String.format("OI%03d",orderItemList.size()+1);
           OrderItem newOrderItem = new OrderItem(orderItemId, orderId, "I001", qty, unitPrice);
           orderItemList.add(newOrderItem);
           return true;
       }catch (Exception e) {
        e.printStackTrace();
        return false;
         }
           
       }
   
   public class BestCustomer{
       private String customerId;
       private String name;
       private double total;
   
   
  public BestCustomer(String customerId, String name, double total) {
      this.customerId = customerId;
      this.name = name;
      this.total = total;
      
  }
  
  public String getCustomerId(){
      return customerId;
  }
  
  public String getName() {
      return name;
  }
  
  public double getTotal(){
      return total;
  }
   }
   
   public List<BestCustomer> getBestCustomers(){
       List<BestCustomer> bestCustomerList = new ArrayList<>();
       
       for(Customer customer : customerList){
           double customerTotal = 0.0;
       
       
       for (Order order : orderList){
         //  if(order.getCustomerId().equalsIgnoreCase(Customer.getCustomerId()) && order.getOrderStatus() != OrderStatus.CANCELLED);{
            if (order.getCustomerId().equalsIgnoreCase(customer.getCustomerId()) 
                    && order.getOrderStatus() != OrderStatus.CANCELLED) {
                
                for(OrderItem orderItem : orderItemList){
                     if (orderItem.getOrderId().equalsIgnoreCase(order.getOrderId())) {
                        customerTotal += (orderItem.getQtyOnHand() * orderItem.getUnitPrice());
                    }
                }
            }        
          }
       
         bestCustomerList.add(new BestCustomer(customer.getCustomerId(), customer.getName(), customerTotal));
       }
       
        Collections.sort(bestCustomerList, new Comparator<BestCustomer>() {
        @Override
        public int compare(BestCustomer c1, BestCustomer c2) {
            return Double.compare(c2.getTotal(), c1.getTotal());
        }
    });

    return bestCustomerList;
   }
   
   }
   

   

    
    

