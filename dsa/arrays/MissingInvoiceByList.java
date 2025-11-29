package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingInvoiceByList {
    public static void main(String[] args) {
        List<Integer> invoices = Arrays.asList(45,91,90,92,46);
        int minimum = Collections.min(invoices);
        while(true){
            int current = minimum+1;
            if(invoices.contains(current))
                minimum=current;
            else{
                System.out.println("Missing invoice "+current);
                break;
            }
        }
    }
}
