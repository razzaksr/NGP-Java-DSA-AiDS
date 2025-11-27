package foundation;

import java.util.Scanner;

public class Booking {
    public static void main(String[] args) {
        int todayInvoices = 0, stock = 500, totalInvoices = 0;
        Scanner scanner = new Scanner(System.in);
        // booking continues until stock is depleted
        while(stock>0){
            todayInvoices = 0;
            // day starts from 10.00 to 15.00 with 0.010 increments
            for(double time=10.00;time<=15.00&&stock>0;time+=0.500){
                System.out.printf("enter the quantity to book at %.2f: \n", time);
                int quantity = scanner.nextInt();
                if(quantity<=stock){
                    stock -= quantity;
                    todayInvoices++;
                    System.out.printf("Booked %d items at %.2f \n",quantity,time);
                }else{
                    System.out.println("Only "+stock+" items left in stock");
                }
            }
            System.out.println("Day ended with "+todayInvoices+" invoices");
            totalInvoices += todayInvoices;
        }
        System.out.println("All stock booked with total invoices "+totalInvoices);
        scanner.close();
    }
}
