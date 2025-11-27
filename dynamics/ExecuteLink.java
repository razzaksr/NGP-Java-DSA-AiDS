package dynamics;

import java.util.LinkedList;

/*
LinkedList:
Insertion: add/ addLast, addFirst, add(index,object)
Read: getFist, getLast, get(index)
remove: removeLast, removeFirst/remove, remove(index), remove(object)
check object existance: contains(object)>> true/ false
*/

public class ExecuteLink {
    public static void main(String[] args) {
        LinkedList<Double> list1 = new LinkedList<>();
        list1.add(99.99);
        list1.addLast(88.88);
        list1.add(77.77);
        list1.addFirst(6.2);
        list1.add(2,5.6);
        System.out.println(list1);
        list1.remove();// list1.removeFirst()
        System.out.println(list1.getFirst());
        list1.remove(88.88);
        System.out.println(list1.contains(88.88));
        System.out.println(list1.getLast());
    }
}
