/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgershopoop.model;

/**
 *
 * @author sayum
 */
public class OrderItem {
    private String orderItemId;
    private String orderId;
   // private String itemCode;
    private int qtyOnHand;
    private double unitPrice;

    public OrderItem(String orderItemId, String orderId, String itemCode, int qtyOnHand, double unitPrice) {
        this.orderItemId = orderItemId;
        this.orderId = orderId;
        //this.itemCode = itemCode;
        this.qtyOnHand = qtyOnHand;
        this.unitPrice = unitPrice;
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String id) {
        this.orderItemId= orderItemId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

  //  public String getItemCode() {
  //      return itemCode;
  //  }

//    public void setItemCode(String itemCode) {
//        this.itemCode = itemCode;
//    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "OrderItem{" + "orderItemIdd=" + orderItemId + ", orderId=" + orderId + ", qtyOnHand=" + qtyOnHand + ", unitPrice=" + unitPrice + '}';
    }
    
    
}
