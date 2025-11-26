package handling;

import java.util.Scanner;

public class FindOut {
    public static void main(String[] args) {
        String[] campus = {"TCS","Capegemeni","LTIMindtree","IBM","Google"};
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Tell us the day of the company you wish to know ");
            int day = scanner.nextInt();
            System.out.println(campus[day]);
        }catch(ArrayIndexOutOfBoundsException aIndex){
            System.out.println(aIndex+"\nProvide between 0 to "+(campus.length-1));
            int day = scanner.nextInt();
            System.out.println(campus[day]);
        }
        finally{
            System.out.println("Thanks for enquiry!!!");
        }
    }
}
