package dynamics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImplementationOfList {
    public static void main(String[] args) {
        // List<Double> myList = new ArrayList<>();// upcasting
        List<Double> myList = Arrays.asList(1.4,2.4,91.2,8.9,21.9);
        myList.set(2, 2.4);
        System.out.println(myList);
        Collections.sort(myList,(obj1,obj2)->obj2.compareTo(obj1));
        System.out.println(myList);
        // Collections.reverse(myList);
        // System.out.println(myList);
        Collections.replaceAll(myList, 2.4, 21.9);
        System.out.println(myList);
    }
}
