package dynamics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ExecuteSet {
    public static void main(String[] args) {
        LinkedHashSet<Character> setOne = new LinkedHashSet<>();
        setOne.add('R');setOne.add('M');setOne.add('V');
        setOne.add('O');setOne.add('V');setOne.add('W');
        setOne.add('U');setOne.add('Q');setOne.add('K');
        HashSet<Character> setTwo = new HashSet();
        TreeSet<Character> setThree = new TreeSet<>();
        setTwo.addAll(setOne);setThree.addAll(setOne);
        System.out.println("LinkedHashSet "+setOne);
        System.out.println("Hash Set Values "+setTwo);
        System.out.println("Tree Set Values "+setThree);
        setOne.remove('R');setTwo.remove('W');setTwo.add('X');
        setTwo.add('L');
        System.out.println(setThree.contains('R'));
        System.out.println("Hash Set Values "+setTwo);
        setTwo.removeAll(setThree); 
        System.out.println("Hash Set Values "+setTwo);
        System.out.println("Tree Set Values "+setThree);
        setThree.retainAll(setOne);
        System.out.println("Tree Set Values "+setThree);
    }
}
