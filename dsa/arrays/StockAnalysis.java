package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StockAnalysis {
    public static void mahisha(List<Integer> myList){
        int buy = Collections.min(myList);
        int sell = 0;
        int buyPosition = myList.indexOf(buy);
        if((buyPosition+1)==myList.size()){
            System.out.println("Loss ");
            List<Integer> sub = myList.
            subList(0,buyPosition);
            sell = Collections.min(sub);
            System.out.println("Buying @ "+
            sell+" selling @ "+buy);
        }
        else{
            List<Integer> sub =  myList.
            subList(buyPosition+1,myList.size());
            sell = Collections.max(sub);
            System.out.println("Buying @ "+buy+" selling @ "+sell);
        }
    }
    public static void main(String[] args) {
        List<Integer> stk = Arrays.asList( 7, 1, 5, 3, 6, 4);
        mahisha(stk);
        stk = Arrays.asList(90, 40, 20, 10, 4);
        mahisha(stk);
        stk = Arrays.asList(-10, -5, -2, -1, 1);
        mahisha(stk);
    }
}
