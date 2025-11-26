package oops;

import java.util.Scanner;

public class Transaction{
    public static void main(String[] args) {
        DebitCard debitCard1 = new DebitCard(87656789876567L,9911);
        debitCard1.setAccountNumber(876567893);
        debitCard1.setAccountHolderName("Razak Mohamed S");
        debitCard1.setBalance(12999.5);
        // debitCard1.transaction(900.0);// account's withdraw
        // debitCard1.transaction(8999);// account's deposit
        debitCard1.cashDispense(900000);
    }
}
// single
class DebitCard extends Account{
    private long cardNumber;
    private int cardPin;
    private Scanner scan = new Scanner(System.in);

    public void cashDispense(double amount){
        System.out.println("enter the pin to withdraw ");
        int currentPin = scan.nextInt();
        if(this.cardPin==currentPin){
            this.transaction(amount);// calling withdraw of account class
        }
        else{
            System.out.println("Invalid PIN/ Unauthorized Access");
        }
    }

    public DebitCard(long cardNumber, int cardPin) {
        this.cardNumber = cardNumber;
        this.cardPin = cardPin;
    }
    public DebitCard() {
    }
    public long getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }
    public int getCardPin() {
        return cardPin;
    }
    public void setCardPin(int cardPin) {
        this.cardPin = cardPin;
    }
}