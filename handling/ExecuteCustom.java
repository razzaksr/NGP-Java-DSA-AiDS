package handling;

import java.util.Scanner;

public class ExecuteCustom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long aadhaarNumber = 0L;
        System.out.println("Enter your Aadhaar number ");
        try{
            aadhaarNumber = scanner.nextLong();
            if(String.valueOf(aadhaarNumber).length() != 12){
                throw new AadhaarInvalidException();
            }
        }catch(AadhaarInvalidException aie){
            System.out.println(aie);
            System.out.println("Please provide a valid Aadhaar number of 12 digits");
            aadhaarNumber = scanner.nextLong();
        }
        System.out.println("Your Aadhaar number is "+aadhaarNumber);
        scanner.close();
    }
}
