package dynamics;

import java.util.PriorityQueue;

public class ExecutePriority {
    public static void main(String[] args) {
        // keeps ascending order
        PriorityQueue<Integer> queue1 = new PriorityQueue<>((obj1,obj2)->obj2-obj1);
        queue1.offer(89);queue1.offer(91);queue1.offer(12);
        queue1.offer(8);queue1.offer(5);queue1.offer(120);
        // System.out.println(queue1);
        while (!queue1.isEmpty()) {
            System.out.print(queue1.poll() + " ");
        }
    }
}
