package arrays;

import java.util.Arrays;

public class MovingZeros {
    public static void greedy(int[] arr){
        System.out.println("Before "+Arrays.toString(arr));
        int valid = 0 ;
        for(int index = 0;index<arr.length;index++){
            if(arr[index]!=0){
                arr[valid]=arr[index];
                valid++;
            }
        }
        Arrays.fill(arr, valid, arr.length, 0);
        System.out.println("After "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {20,0,19,5,0,3,10,0,2};
        greedy(arr);
    }
}
