package tree;

import java.util.Arrays;

class SegmentTree{
    private int size;
    private int[] original;
    public int[] sumsTree;
    public SegmentTree(int[] given){
        size = given.length;
        original = given.clone();
        sumsTree = new int[4*size];
        construct(1, 0, size-1);
    }
    public void construct(int node, int start, int end){
        if(start==end)
            sumsTree[node]=original[start];
        else{
            int mid = (start+end)/2;
            construct(node*2, start, mid);// left
            construct(node*2+1,mid+1,end);// right
            sumsTree[node] = 
            sumsTree[node*2] + sumsTree[node*2+1];
        }
    }
    public int rangeQuerySum(int givenStart, int givenEnd){
        System.out.println("sum of "+givenStart+" and "+givenEnd);
        return findSum(1, 0, size-1, givenStart, givenEnd);
    }
    private int findSum(int node, int start, int end, int givenStart, int givenEnd){
        if(givenEnd < start || end < givenStart) return 0;
        if(givenStart <= start && end <= givenEnd) 
            return sumsTree[node];
        int mid = (start+end)/2;
        return 
        findSum(node*2, start, mid, givenStart, givenEnd) 
        + 
        findSum(node*2+1, mid+1, end, givenStart, givenEnd);
    }
}

public class SegmentTreeImplementation {
    public static void main(String[] args) {
        int[] myArray = {2,5,1,4,9,3};
        SegmentTree segment = new SegmentTree(myArray);
        System.out.println(Arrays.toString(segment.sumsTree));
        System.out.println(segment.rangeQuerySum(0, 3));
    }
}
