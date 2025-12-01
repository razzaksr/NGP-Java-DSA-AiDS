package stacks;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void findGreater(int[] source){
        int[] result = new int[source.length];
        Arrays.fill(result, -1);
        Stack<Integer> stk = new Stack<>();

        for(int index = 0; index < source.length;index++){
            while(!stk.isEmpty()&&source[stk.peek()]<source[index]){
                result[stk.peek()]=source[index];
                stk.pop();
            }
            stk.push(index);
        }
        System.out.println(Arrays.toString(result));
    }
    public static void main(String[] args) {
        findGreater(new int[]{4,5,2,25});
        findGreater(new int[]{2,1,3});
    }
}
