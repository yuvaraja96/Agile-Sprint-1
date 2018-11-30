/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderpickup;

/**
 *
 * @author Yuvaraja
 */
public class Delivery {
    String name, address, orderId, deliveryStatus;
    int contactNo;
    
    public Delivery(String custName, String custAddress, String orderId, String status, int contact){
        this.name = custName;
        this.address = custAddress;
        this.orderId = orderId;
        this.deliveryStatus = status;
        this.contactNo = contact;

    }
   
}
