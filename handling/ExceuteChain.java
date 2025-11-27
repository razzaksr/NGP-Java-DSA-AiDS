package handling;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceuteChain {
    public static void main(String[] args) {
        Float[] cost = {12.5f, 45.6f, 78.9f, 23.4f, 56.7f};
        int index=0, discount=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index of the product you wish to offer discount ");
        try{
            index = scanner.nextInt();
            System.out.println("Discount wish to offer for product "+cost[index]);
            discount = scanner.nextInt();
            cost[index] = cost[index] - (cost[index] * discount / 100);
            System.out.println("Final Cost\n"+Arrays.toString(cost));
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println(aie+"\nProvide index between 0 to "+(cost.length-1)+" in numerical format");
            index = scanner.nextInt();
            System.out.println("Discount wish to offer for product "+cost[index]+" in numerical format");
            discount = scanner.nextInt();
            cost[index] = cost[index] - (cost[index] * discount / 100);
            System.out.println("Final Cost\n"+Arrays.toString(cost));
        }
        catch(InputMismatchException ime){
            System.out.println(ime+"\nPlease provide the index and discount in numerics");
            Scanner scan = new Scanner(System.in);
            try{
                index = scan.nextInt();
                System.out.println("Discount wish to offer for product "+cost[index]);
                discount = scan.nextInt();
                cost[index] = cost[index] - (cost[index] * discount / 100);
                System.out.println("Final Cost\n"+Arrays.toString(cost));
            }catch(ArrayIndexOutOfBoundsException aie){
                System.out.println(aie+"\nProvide index between 0 to "+(cost.length-1));
                index = scan.nextInt();
                System.out.println("Discount wish to offer for product "+cost[index]);
                discount = scan.nextInt();
                cost[index] = cost[index] - (cost[index] * discount / 100);
                System.out.println("Final Cost\n"+Arrays.toString(cost));
            }
            scan.close();
        }catch(Exception e){
            System.out.println(e+"\nSome unexpected error occured");
        }
        scanner.close();
    }
}
