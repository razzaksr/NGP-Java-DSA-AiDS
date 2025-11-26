package handling;

import foundation.Slot;

public class ExecuteMods extends Slot{
    public static void main(String[] args) {
        // Teller.main(args);
        // Slot slot = new Slot();
        // slot.username = "john_doe";// since username is default package level access
        // slot.accessCode = 12345; // protected access within the same package
        ExecuteMods exec = new ExecuteMods();
        exec.accessCode = 67890; // protected access through inheritance
        System.out.println(exec.accessCode);
    }
}