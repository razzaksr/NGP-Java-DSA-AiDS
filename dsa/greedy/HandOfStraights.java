package greedy;

import java.util.TreeMap;

public class HandOfStraights {
    public static boolean isGrouped(int[] hand, int gSize){
        if(hand.length%gSize!=0) return false;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int each:hand){
            int freq = map.getOrDefault(each, 0);
            map.put(each, freq+1);
        }
        while(!map.isEmpty()){
            int min = map.firstKey(); // small the key of treemap
            for(int index=0;index<gSize;index++){
                int cur = min + index;
                if(!map.containsKey(cur)) return false;
                map.put(cur,map.get(cur)-1);
                if(map.get(cur)==0) map.remove(cur);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isGrouped(new int[]{1,2,3,6,2,3,4,7,8}, 3));
        System.out.println(isGrouped(new int[]{1,2,3,4,5}, 4));
        System.out.println(isGrouped(new int[]{1,2,4,5,7,8}, 3));
        System.out.println(isGrouped(new int[]{1,1,1,2,3,4}, 3));
    }
}
