package oops;

import java.util.Scanner;

public class Account implements Cloneable {
    private String accountHolderName;
    private Long accountNumber;
    private Double balance;

    

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        Account cloned = (Account) super.clone();// down casting
        return cloned;
    }

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

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Account() {
    }

    public Account(String accountHolderName, long accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
    }
}
