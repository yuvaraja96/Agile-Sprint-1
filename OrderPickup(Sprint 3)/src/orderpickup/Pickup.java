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
public class Pickup {
    String name, pickupId, pickupStatus;
    int contactNo;
    
public Pickup(String custName, String pickupId, String status, int contact){
   this.name = custName;
   this.pickupId = pickupId;
   this.pickupStatus = status;
   this.contactNo = contact;

    }
}
