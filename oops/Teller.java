package oops;

import java.util.Scanner;

public class Teller {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Account account1 = new Account("John Doe", 123456789L, 1000.0);
        System.out.println("Tell us what you wish to do");
        System.out.println("Deposit\nWithdraw\nFind Charges\nany to exit");
        String option = scan.next();
        switch (option) {
            case "Deposit":case "deposit":case "DEPOSIT":case "credit":
                System.out.println("Tell us the amount to be deposited ");
                int amount = scan.nextInt();
                account1.transaction(amount);
                break;
            case "Withdraw":case "withdraw":case "WITHDRAW":case "debit":
                System.out.println("Tell us the amount to be withdrawn ");
                int amountWithdraw = scan.nextInt();
                account1.transaction(amountWithdraw);
                break;
            case "Find Charges":case "find charges":case "FIND CHARGES":case "charges":
                account1.findCharges();
                break;
            default:
                System.out.println("Exiting the system. Have a nice day!");
                break;
        }
        scan.close();
    }
}