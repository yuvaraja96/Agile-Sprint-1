package agilesprint2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class AgileSprint2 {

    static final double LIMIT = 500;
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("RM0.00");
        
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String strDate = DateTimeFormatter.ofPattern("dd").format(now);
        
        Date date;
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH);
        int date2 = Integer.parseInt(strDate);
        
        String []arrMONTH = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
                            
        //invoice should separate for every month
        
        
        System.out.println("Customer Maintainance and Invoice Payment");
        System.out.println("=========================================");
        
        System.out.print("\n===== Corporate Customer List =====\n");
        
        String []corporateCust = {"KENT", "YUVA", "ZHIHWA", "KHEING"};
        double []custLimit = {100, 200, 300, 400};
        
        System.out.println("0. Exit");
        for(int i = 0; i < corporateCust.length; i++){
            System.out.println((i+1) + ". " + corporateCust[i]);
        }
        
        System.out.print("Please enter a number from customer list that you want to check order limit. : ");
        int usrInput = s.nextInt();
       
        
        while(usrInput > corporateCust.length){
            System.out.print("Invalid Input, Please enter a number from list : ");
            usrInput = s.nextInt();
        }
        
        if(usrInput == 0){
            System.exit(0);
        }
        
        System.out.println("The current limit is " + formatter.format(custLimit[usrInput - 1]) + "/" + formatter.format(LIMIT));
        
        String usrInput2;
    
        System.out.print("Do you want to generate an invoice? (Yes/No): ");
        usrInput2 = s.next();
  
        if("YES".equals(usrInput2.toUpperCase())){
            System.out.print("\n===== Invoice =====\n");
            System.out.printf("%-10s %s\n","Name: ", corporateCust[usrInput - 1]);
            System.out.printf("%-10s %s\n","Payment: ",custLimit[usrInput - 1]);
            System.out.printf("%-10s %s\n","Date: ",dtf.format(now));
            if(strDate.equals("07")){
                System.out.println("Please make your payment by today.");
            }else if(date2 > 7){
                System.out.println("Please make your payment before 7 of " +arrMONTH[month + 1]);
            }else{
                System.out.println("Please make your payment before 7 of " +arrMONTH[month]);
            }
            System.exit(0);
        }else if(("NO".equals(usrInput2.toUpperCase()))){
            System.exit(0);
        }else{
            while(!"YES".equals(usrInput2.toUpperCase()) || !"NO".equals(usrInput2.toUpperCase())){
                System.out.print("Please enter only 'yes' or 'no' in order to proceed. ");
                usrInput2 = s.next();
                    if("YES".equals(usrInput2.toUpperCase())){
                        System.out.print("\nInvoice ======\n");
                        System.out.printf("%-10s %s\n","Name: ", corporateCust[usrInput - 1]);
                        System.out.printf("%-10s %s\n","Payment: ",custLimit[usrInput - 1]);
                        System.out.printf("%-10s %s\n","Date: ",dtf.format(now));
                        if(strDate.equals("07")){
                            System.out.println("Please make your payment by today.");
                        }else if(date2 > 7){
                            System.out.println("Please make your payment before 7 of " +arrMONTH[month + 1]);
                        }else{
                            System.out.println("Please make your payment before 7 of " +arrMONTH[month]);
                        }
                        System.exit(0);
                    }else{
                        System.exit(0);
                    }
            }
            
        }
        
        
        /*if(!"YES".equals(usrInput2.toUpperCase()) || !"NO".equals(usrInput2.toUpperCase())){
            while(!"YES".equals(usrInput2.toUpperCase()) || !"NO".equals(usrInput2.toUpperCase())){
                System.out.print("Please enter only 'yes' or 'no' in order to proceed.");
                usrInput2 = s.next();
            }
        }else if("NO".equals(usrInput2.toUpperCase())){
            System.exit(0);
        }else if("YES".equals(usrInput2.toUpperCase())){
            System.out.print("\nInvoice ======\n");
            System.out.printf("%-10s %s\n","Name: ", corporateCust[usrInput - 1]);
            System.out.printf("%-10s %s\n","Payment: ",custLimit[usrInput - 1]);
            System.out.println("Please make your payment in order to continue to make order.");
            System.exit(0);
        }*/
    }
}
