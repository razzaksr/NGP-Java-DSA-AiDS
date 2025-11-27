package handling;

import java.util.Scanner;

public class Forwarding {
    static Scanner scanner = new Scanner(System.in);
    public static void perform(){
        try{
            System.out.println("Enter your name ");
            String existingName = scanner.nextLine();
            System.out.println("Your password "+existingName.substring(0,4));
        }catch(StringIndexOutOfBoundsException sie){
            throw sie;// forward to the caller
        }
    }
    public static void main(String[] args) {
        try{
            Forwarding.perform();
        }catch(StringIndexOutOfBoundsException sie){
            System.out.println(sie+"\nName should be minimum of 4 characters");
            perform();
        }
    }
}
