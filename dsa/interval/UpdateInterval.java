package interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpdateInterval {
    public static void insertNewSlot(
        List<List<Integer>> old, List<Integer> latest){
        List<List<Integer>> finalList = new ArrayList<>();
        int size = old.size(), index = 0, cMin =0, cMax=0;
        //1. find and add non overlap to final
        while(index<size&&old.get(index).get(1)<
        latest.get(0)){
            finalList.add((old.get(index)));
            index++;
        }
        // 2. merge overlapping slots
        while(index<size&&old.get(index).get(0)<=
        latest.get(1)){
            cMin = Math.min(old.get(index).get(0), 
            latest.get(0));
            latest.set(0, cMin);
            cMax = Math.max(old.get(index).get(1),
             latest.get(1));
            latest.set(1, cMax);
            index++;
        }
        finalList.add(latest);
        // 3. remaining non overlap to be added
        while(index<size){
            finalList.add(old.get(index));index++;
        }
        // finalList.forEach(one->System.out.println(one));
        System.out.println(finalList);
    }
    public static void main(String[] args) {
        List<List<Integer>> exist = new ArrayList<>();
        exist.add(Arrays.asList(1,3));
        exist.add(Arrays.asList(6,9));
        List<Integer> newList = Arrays.asList(2,5);
        insertNewSlot(exist, newList);
        exist = new ArrayList<>();
        exist.add(Arrays.asList(1,2));
        exist.add(Arrays.asList(3,5));
        exist.add(Arrays.asList(6,7));
        exist.add(Arrays.asList(8,10));
        exist.add(Arrays.asList(12,16));
        newList = Arrays.asList(4,8);
        insertNewSlot(exist, newList);
    }
}
