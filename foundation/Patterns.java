package foundation;

import java.util.Scanner;

public class Patterns {
    public void perfectSqaure(String name){
        System.out.println("Your perfect square pattern is ");
        int limit = name.length();
        // rows
        for(int row = 0; row < limit; row++){
            // columns
            for(int column = 0; column < limit; column++){
                System.out.print(name.charAt(column));
            }
            System.out.println();
        }
    }
    public void perfectSqaure(int limit){
        // rows
        for(int row = 1; row <= limit; row++){
            // columns
            for(int column = 1; column <= limit; column++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public void leftUpperFloyd(int limit){
        // rows
        for(int row = 1; row <= limit; row++){
            // columns
            for(int column = 1; column <= row; column++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public void rightUpperFloyd(int limit){
        // rows
        for(int row = 1; row <= limit; row++){
            // spaces
            for(int space = limit; space > row; space--){
                System.out.print(" ");
            }
            // data
            for(int data = 1; data <= row; data++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public void upperPyramid(int limit){
        // rows
        for(int row = 1; row <= limit; row++){
            // spaces
            for(int space = limit; space > row; space--){
                System.out.print(" ");
            }
            // data
            for(int data = 1; data <= (2*row - 1); data++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public void sandClock(int limit){
        // upper part >> limit = 11>> 11,10,9,8,7,6
        for(int row = limit; row >= 1; row--){
            // spaces
            for(int space = limit; space > row; space--){
                System.out.print(" ");
            }
            // data
            for(int data = 1; data <= (2*row-1); data++){
                System.out.print("#");
            }
            System.out.println();
        }
        // lower part
        // rows
        for(int row = 2; row <= limit; row++){
            // spaces
            for(int space = limit; space > row; space--){
                System.out.print(" ");
            }
            // data
            for(int data = 1; data <= (2*row - 1); data++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Patterns patterns = new Patterns();
        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the name for perfect square pattern ");
        // String name = scan.next();
        // patterns.perfectSqaure(name);
        System.out.println("Enter the limit for patterns ");
        int limit = scan.nextInt();
        // patterns.perfectSqaure(limit);
        // patterns.leftUpperFloyd(limit);
        // patterns.rightUpperFloyd(limit);
        // patterns.upperPyramid(limit);
        patterns.sandClock(limit);
        scan.close();
    }
}