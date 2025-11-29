package arrays;

import java.util.Arrays;

public class ExecuteMerge {
    // merge
    public static void merge(int[] arr, int start, int mid, int end){
        // initialize size of left and right array
        int leftSize = mid-start+1;
        int rightSize = end-mid;
        int leftIndex =0 , rightIndex = 0, index = 0;
        // initialize left and right array by those respective sizes
        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];
        // copy values for left and right array from your source/original
        for(leftIndex = 0;leftIndex < leftSize; leftIndex++){
            leftArray[leftIndex] = arr[start+leftIndex];
        }
        for(rightIndex=0;rightIndex<rightSize;rightIndex++){
            rightArray[rightIndex] = arr[mid+1+rightIndex];
        }
        // System.out.println("Left Array Values "+Arrays.toString(leftArray));
        // System.out.println("Right Array Values "+Arrays.toString(rightArray));
        // compare copy >> sort
        leftIndex =0 ; rightIndex = 0; index = start;
        while(leftIndex<leftSize&&rightIndex<rightSize){
            if(leftArray[leftIndex]<rightArray[rightIndex]){
                arr[index] = leftArray[leftIndex];
                leftIndex++;
            }
            else{
                arr[index] = rightArray[rightIndex];
                rightIndex++;
            }
            index++;
        }
        // after sort copy remaining values
        while(leftIndex<leftSize){
            arr[index] = leftArray[leftIndex];
            leftIndex++;index++;
        }
        while(rightIndex<rightSize){
            arr[index] = rightArray[rightIndex];
            rightIndex++;index++;
        }
    }
    // divide
    public static void divide(int[] arr, int start, int end){
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, start, end+1)));
        if(start<end){
            int mid = start+(end-start)/2;
            divide(arr, start, mid);
            divide(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }
    public static void main(String[] args) {
        int[] numbers = {91,14,32,65,23};
        divide(numbers, 0, numbers.length-1);
        System.out.println("After Sort called\n"+Arrays.toString(numbers));
    }
}
