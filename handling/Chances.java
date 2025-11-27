package handling;

import java.util.Scanner;

public class Chances {
    static int chances = 1;
    public static void main(String[] args) {
        double productCost=699.12, finalCost=0;int discount=0;
        String strDiscount="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the discount you wish offer ");
        strDiscount = scanner.next();
        // parsing
        try{
            discount = Integer.parseInt(strDiscount);
            finalCost = productCost - (productCost * discount / 100);
            System.out.println("The final cost after discount is: "+finalCost);
        }catch(NumberFormatException nfe){
            chances++;
            if(chances<=3){
                System.out.println(nfe+"\nPlease provide the discount in numerics");
                main(args);
            }
            else{
                System.out.println("You have exhausted all your chances!!!");
            }
        }
        scanner.close();
    }
}
