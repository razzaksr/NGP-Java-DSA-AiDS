package dynamics;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class ImplementAnalysis {
    public static void main(String[] args) {
        long startTime, endTime, result;
        List<Double> myList = new ArrayList<>();
        List<Double> myVector = new Vector<>();
        LinkedHashSet<Double> mySet = new LinkedHashSet<>();
        Random random = new Random();
        int target = 10_00_000;
        // check myVector
        startTime = System.nanoTime();
        for(int count = 1; count<=target; count++){
            myVector.add(random.nextDouble(1000));
        }
        endTime = System.nanoTime();
        result = (endTime-startTime)/target;
        System.out.println(result+" ns has taken for Vector");
        // check myList
        startTime = System.nanoTime();// 
        for(int count = 1; count<=target; count++){
            myList.add(random.nextDouble(1000));
        }
        endTime = System.nanoTime();
        result = (endTime-startTime)/target;
        System.out.println(result+" ns has taken for List");
        // check mySet
        startTime = System.nanoTime();// 
        for(int count = 1; count<=target; count++){
            mySet.add(random.nextDouble(1000));
        }
        endTime = System.nanoTime();
        result = (endTime-startTime)/target;
        System.out.println(result+" ns has taken for Set");
    }
}
