package handling;

import java.io.IOException;
import java.util.Scanner;

public class RunPrompt {
    public static void main(String[] args) throws IOException, InterruptedException {
        try(Scanner scanner = new Scanner(System.in)){
            Runtime runObject = Runtime.getRuntime();
            System.out.println("Enter the app to open ... ");
            String app = scanner.next();
            Thread.sleep(5000);
            Process pObject = runObject.exec(app);
        }
        
    }
}
