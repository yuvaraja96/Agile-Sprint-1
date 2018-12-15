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
import java.util.*;

public class OrderPickup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String[] custPickup1 = new String[] {"Siti","20215","0125455651"};
        String[] custPickup2 = new String[] {"Siti","20215","0125455651"};
        String[] custPickup3 = new String[] {"Siti","20215","0125455651"};
          
        String[] custDelivery1 = new String[] {"Ali","63515","251651553","Selangor"};
        String[] custDelivery2 = new String[] {"Ali","63515","251651553","Selangor"}; 
        String[] custDelivery3 = new String[] {"Ali","63515","251651553","Selangor"};
        
        
        System.out.println("---------FIORE FLOWERSHOP SDN. BHD---------\n");
        System.out.print("Please select type of orders: " + "\n1. Order Pickup\n" + "2. Order Delivery\n" + "Choice: ");
        int choice = s.nextInt();
        
        if(choice == 1){
                System.out.println("Hi, welcome to Order Pickup.");
        
                System.out.println(Arrays.toString(custPickup1) + "\n" + Arrays.toString(custPickup2)+ "\n" + Arrays.toString(custPickup3));
        
    }else if(choice == 2){
                System.out.println("Hi, welcome to Order Delivery.");
        
                System.out.println(Arrays.toString(custDelivery1) + "\n" + Arrays.toString(custDelivery2)+ "\n" + Arrays.toString(custDelivery3));

    }else{
               System.out.println("Invalid choice. Please select suitable choice.");
               System.out.print("Please select type of orders: " + "\n1. Order Pickup\n" + "2. Order Delivery\n" + "Choice: ");
     
        
         }
    
    }
}