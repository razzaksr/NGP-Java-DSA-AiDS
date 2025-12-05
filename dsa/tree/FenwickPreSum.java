package tree;

import java.util.Arrays;

class FenwickTree{
    public int[] BIT;
    private int size;
    public FenwickTree(int[] original){
        size = original.length;
        BIT = new int[size+1];
        for(int pos = 0;pos<size;pos++){
            update(pos, original[pos]);
        }
    }
    public void update(int index, int data){
        index++;
        while(index<=size){
            BIT[index] += data;
            index += (index&-index);
        }
    }
    // enquiry: index = 3, sum of 0 to 3
    public int prefixSum(int index){
        index++;
        int sum = 0;
        while(index > 0){
            sum += BIT[index];
            index -= (index&-index);
        }
        return sum;
    }
    public int rangeSum(int start, int end){
        return prefixSum(end) - prefixSum(start-1);
    }
}

public class FenwickPreSum {
    public static void main(String[] args) {
        int[] myArray = {2,5,1,4,9,3};
        FenwickTree fen = new FenwickTree(myArray);
        System.out.println(Arrays.toString(fen.BIT));
        System.out.println("Prefix sum for [0:3] = "+fen.prefixSum(3));
        System.out.println("Range Sum [1:4] "+fen.rangeSum(1, 4));
    }
}
