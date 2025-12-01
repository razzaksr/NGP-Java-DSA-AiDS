package arrays;

import java.util.Arrays;

public class SortingViaQuick {
    public static int findPivot(int[] arr, int start, int end){
        int init = start-1;
        int pivotalData = arr[end];
        for(int current=start;current<end;current++){
            if(arr[current]>=pivotalData){
                init++;
                int temp = arr[current];
                arr[current] = arr[init];
                arr[init] = temp;
            }
        }
        //mandate swap
        int temp = arr[init+1];
        arr[init+1] = arr[end];
        arr[end] = temp;

        return init+1;
    }
    public static void sort(int[] arr, int start, int end){
        if(start<end){
            int pivotalPoint = findPivot(arr, start, end);
            sort(arr, start, pivotalPoint-1);
            sort(arr, pivotalPoint+1, end);
        }
    }
    public static void main(String[] args) {
        int[] arr={4,5,2,25};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        arr=new int[]{90,23,14,56};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
