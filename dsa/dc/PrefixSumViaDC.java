package dc;

import java.util.Arrays;

public class PrefixSumViaDC {
    public static void processPrefix(int[] src, int[] res, int cur){
        if(cur==0){res[0]=src[0];return;}
        processPrefix(src, res, cur-1);
        res[cur]=res[cur-1]+src[cur];
    }
    public static void doPrefix(int[] src, int[] res,
         int start, int end){
        if(start==end){res[start]=src[start];return;}
        int mid = start+(end-start)/2;
        doPrefix(src, res, start, mid);
        doPrefix(src, res, mid+1, end);
        int off = res[mid];
        for(int index = mid+1; index<=end; index++){
            res[index] += off;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 1, 4, 1, 5, 9};
        int[] res1 = new int[arr1.length];
        int[] arr2 = {5, 10, 15, 20, 25};
        int[] res2 = new int[arr2.length];
        int[] arr3 = {1, 2, 3, 4};
        int[] res3 = new int[arr3.length];
        // doPrefix(arr1, res1, 0, arr1.length-1);
        // doPrefix(arr2, res2, 0, arr2.length-1);
        // doPrefix(arr3, res3, 0, arr3.length-1);
        processPrefix(arr3, res3, arr3.length-1);
        processPrefix(arr2, res2, arr2.length-1);
        processPrefix(arr1, res1, arr1.length-1);
        System.out.println(Arrays.toString(res3));
        System.out.println(Arrays.toString(res2));
        System.out.println(Arrays.toString(res1));
    }
}
