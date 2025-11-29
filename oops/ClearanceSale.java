package oops;

import java.util.Scanner;

public class ClearanceSale {
    public static void main(String[] args) {
        int stock = 100, invoice = 0, days = 3;
        Scanner scan = new Scanner(System.in);
        // O(n)
        while(stock>0&&days>0){
            System.out.println("Enter the quantity to purchase: ");
            int quantity = scan.nextInt();
            if(quantity <= stock){
                stock -= quantity;// non linear
                System.out.println("Purchase successful! Remaining stock: " + stock);
                invoice++;
            }
            else{
                System.out.println("Insufficient stock! Available stock: " + stock);
            }
            days--;
        }
        System.out.println("Total invoices generated: " + invoice);
        System.out.println("Stock left after clearance sale: " + stock);
        scan.close();
    }
}
