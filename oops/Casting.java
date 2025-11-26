package oops;

public class Casting {
    public static void main(String[] args) {
        Sourcing source = new Outsourcing();// upcasting
        source.displayAccounts();
        // source.nonMaintainanceCustomers();
        if(source instanceof Outsourcing){
            Outsourcing out = (Outsourcing) source; // downcasting
            out.nonMaintainanceCustomers();
        }
    }
}
class Sourcing{
    // array of account objects
    Account[] savingAccounts = new Account[5];
    public Sourcing(){
        savingAccounts[0] = new Account("Alice", 111111111L, 50000.0);
        savingAccounts[1] = new Account("Bob", 222222222L, 3000.0);
        savingAccounts[2] = new Account("Charlie", 333333333L, 7000.0);
        savingAccounts[3] = new Account("Diana", 444444444L, 6000.0);
        savingAccounts[4] = new Account("Ethan", 555555555L, 80000.0);
    }
    public void displayAccounts(){
        for(Account acc : savingAccounts){
            System.out.println("Account Holder: " + acc.getAccountHolderName() +
                               ", Account Number: " + acc.getAccountNumber() +
                               ", Balance: " + acc.getBalance());
        }
    }
}
class Outsourcing extends Sourcing{
    // additional functionalities can be added here
    public void nonMaintainanceCustomers(){
        for(Account acc : savingAccounts){
            if(acc.getBalance() < 10000){
                System.out.println("Non-maintenance customer: " + acc.getAccountHolderName());
            }
        }
    }
}