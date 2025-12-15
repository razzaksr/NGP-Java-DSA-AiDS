package arrays;

import java.util.Arrays;

public class PivotalPoint {
    public static int find(int[] arr){
        int preSum = 0;
        for(int index = 0;index < arr.length;index++){
            int[] subArray = Arrays.copyOfRange
            (arr, index+1, arr.length);
            int postSum = Arrays.stream(subArray).sum();
            if(preSum == postSum) return index;
            preSum += arr[index];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int received = find(arr);
        System.out.println(received);
        received = find(new int[]{0,-3,5,-4,-2,3,1,0});
        System.out.println(received);
    }
}
