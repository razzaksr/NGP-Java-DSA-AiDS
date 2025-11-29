package arrays;

public class MissingInvoice {
    public static boolean isExists(int[] arr, int value){
        for(int temp:arr)
            if(temp==value)
                return true;
        return false;
    }
    public static void main(String[] args) {
        // int[] invoices = {45,91,90,92,46};
        // int[] invoices = {1,2,3,4,5};
        int[] invoices = {12,13,14,16,17};
        int min =Integer.MAX_VALUE;
        // find min
        for(int temp:invoices)
            if(temp<=min)
                min = temp;
        // check min+1 is available
        while(true){
            int current = min+1;// 46
            if(isExists(invoices, current))
                min=current;
            else{
                System.out.println("Missing invoice "+current);
                break;
            }
        }
    }
}
