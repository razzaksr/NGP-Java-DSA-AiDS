package stacks;

import java.util.Stack;

public class FindLargestAreRectInHist {
    public static void findArea(int[] arr){
        int maxArea = Integer.MIN_VALUE;
        Stack<Integer> indStack = new Stack<>();
        // iterate over the array
        for(int index=0; index<=arr.length;index++){
            int currentValue = (index==arr.length)?0: arr[index];
            while(!indStack.isEmpty()&&currentValue<arr[indStack.peek()]){
                int height = arr[indStack.pop()];
                int width = (indStack.isEmpty())?index:index-indStack.peek()-1;
                maxArea = Math.max(maxArea, (width*height));
            }
            indStack.push((index));
        }
        System.out.println("Max area "+maxArea);
    }
    public static void main(String[] args) {
        // int[] arr = {2,3,4,5,2,3};
        int[] arr = {1,2,5,6};
        findArea(arr);
    }
}
