package handling;

import java.util.Scanner;

public class Accessing {
    public static void main(String[] args) {
        String active = null;
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println(active.charAt(0));
            System.out.println("Processing!!!!!!!!!");
        }catch(NullPointerException pointer){
            pointer.printStackTrace();
            System.out.println("enter the text to find character");
            active = scan.next();
            System.out.println(active.charAt(0));
            System.out.println("Processing!!!!!!!!!");

        }
        System.out.println("Execution done");
    }
}
