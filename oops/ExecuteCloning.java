package oops;

public class ExecuteCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Account account1 = new Account("Jane Smith", 987654321L, 2000.0);
        Account account2 = account1; // Reference copy
        System.out.println("Account 1: " + account1);
        System.out.println("Account 2: " + account2);
        account2.setBalance(100);
        System.out.println("Account 2 after change: " + account2);
        System.out.println("Account 1 after Account 2 change: " + account1);
        Account account3 = (Account)account1.clone(); // Cloning via clone() which raises CloneNotSupportedException
        account3.setBalance(500);
        System.out.println("Account 3 after cloning and change: " + account3);
        System.out.println("Account 1 after Account 3 change: " + account1);
    }
}
