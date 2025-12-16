package arrays;

import java.util.Hashtable;
import java.util.Map;

public class LCSLenmgth {
    public static int viaMap(int[] arr){
        int length = 0;
        Map<Integer, Integer> tab = new Hashtable<>();
        for(int each:arr){
            if(!tab.containsKey(each)){
                int left = tab.getOrDefault(each-1, 0);
                int right = tab.getOrDefault(each+1, 0);
                int sum = left+right+1;
                tab.put(each, sum);
                if(left>0) tab.put(each-left, sum);
                if(right>0) tab.put(each+right, sum);
                length = Math.max(sum, length);
            }
        }
        return length;
    }
    public static void main(String[] args) {
        int received = viaMap(new int[]{100,4,200,1,3,2});
        System.out.println(received);
        received = viaMap(new int[]{0,3,7,2,5,8,4,6,0,1});
        System.out.println(received);
        received = viaMap(new int[]{1,0,1,2});
        System.out.println(received);
        received = viaMap(new int[]{100,4,5,6,1,2});
        System.out.println(received);
    }
}
