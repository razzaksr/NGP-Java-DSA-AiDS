package foundation;
public class Members {
    public static void main(String[] args) {
        // Classname objectName = new Classname();
        ATM priya = new ATM();
        ATM victor = new ATM();
        // Non static member access
        System.out.println("priya Account Balance: " + priya.accountBalance);
        System.out.println("victor Account Balance: " + victor.accountBalance);
        priya.accountBalance += 5000;
        System.out.println("priya Account Balance after deposit: " + priya.accountBalance);
        System.out.println("victor Account Balance remains: " + victor.accountBalance);
        // static member access
        System.out.println("ATM Machine Balance: " + ATM.machineBalance);
        // priya.machineBalance -= 2000;
        ATM.machineBalance -= 2000;
        System.out.println("ATM Machine Balance after priya withdrawal: " + priya.machineBalance);
        System.out.println("ATM Machine Balance via victor withdrawal: " + victor.machineBalance);

    }
}

class ATM{
    int accountBalance = 10000;
    static int machineBalance = 50000;
}