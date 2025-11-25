package oops;

import java.util.Scanner;

public class Teller {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Account account1 = new Account("John Doe", "123456789", 1000.0);
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

class Account{
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public void findCharges(){
        Scanner scan = new Scanner(System.in);
        System.out.println("tell us last 10 transaction ");
        double previousBalance = 0;int count = 0;
        for(int current = 1; current <= 10; current++){
            System.out.println("enter the current balance ");
            double currentBalance = scan.nextDouble();
            if(current==1){
                previousBalance = currentBalance;
                continue;
            }
            else{
                if(currentBalance < previousBalance){
                    count++;
                }
            }
        }
        System.out.println("No of debits are "+count);
        count-=3;
        if(count > 0){
            double charges = count * 25;
            System.out.println("total charges are "+charges);
            this.balance -= charges;
            System.out.println("new balance is "+this.balance);
        }
        scan.close();
    }

    public void transaction(double amount){
        if(this.balance >= amount){
            if(amount % 100 == 0 || amount % 500 == 0 || amount % 200 == 0){
                this.balance -= amount;
                System.out.println("Withdrawn: " + amount + ", New Balance: " + this.balance+" in "+accountNumber);
            }
            else{
                System.out.println("Invalid Denomination for withdrawal in " + accountNumber);
            }
        } else {
            System.out.println("Insufficient balance to withdraw " + amount + " from " + accountNumber);
        }
    }

    public void transaction(int amount){
        this.balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + this.balance+" in "+accountNumber);
    }

    // initialization
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account() {
    }

    public Account(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
    }
}
