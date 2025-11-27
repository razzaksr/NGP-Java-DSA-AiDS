package dynamics;

import java.util.ArrayList;
import java.util.Vector;

public class ExecuteList {
    public static void main(String[] args) {
        ArrayList<Short> listOne = new ArrayList<>();
        Vector<Short> listTwo = new Vector<>();

        listTwo.add((short) 9);listTwo.add((short) 35);listTwo.add((short) 120);
        listTwo.add((short) 87);listTwo.add((short) 71);listTwo.add((short) 91);
        // copy all objects from listTwo to listOne
        listOne.addAll(listTwo);
        listOne.set(1,(short)670);
        System.out.println("Array List "+listOne);
        System.out.println("Vector "+listTwo);
        listTwo.remove(2);
        System.out.println("Vector's 2nd Index value "+listTwo.get(2));
        System.out.println(listOne);
        System.out.println(listTwo);
        // listOne.removeAll(listTwo);// listOne will keep non similar objects
        // System.out.println(listOne);
        listTwo.retainAll(listOne);// listTwo will keep only similart objects
        System.out.println(listTwo);
    }
}
