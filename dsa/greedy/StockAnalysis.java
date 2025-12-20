package greedy;

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
    public static void bestTime(int[] arr){
        if(arr.length<2) return;
        int currentBuy = arr[0], currentSell = arr[1];
        int maxProfit = currentSell - currentBuy;
        int currentProfit = Integer.MIN_VALUE;
        for(int index = 1; index<arr.length;index++){
            currentProfit = arr[index]-currentBuy;
            if(currentProfit>maxProfit){
                maxProfit = currentProfit;
                currentSell = arr[index];
            }
            if(currentBuy>arr[index]) 
                currentBuy = arr[index];
        }
        System.out.println("Buy @ "+(currentSell-maxProfit)
        +" sell @ "+currentSell);
    }
    public static void main(String[] args) {
        int[] stk = {7, 1, 5, 3, 6, 4};
        bestTime(stk);
        stk = new int[]{90, 40, 20, 10, 4};
        bestTime(stk);
        stk = new int[]{-10, -5, -2, -1, 1};
        bestTime(stk);
        stk = new int[]{10,6,4,8,2};
        bestTime(stk);
    }
}
