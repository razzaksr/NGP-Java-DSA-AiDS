package dc;

public class SumViaRecursion {
    public static int findSum(int[] arr, int current){
        if(current==arr.length) return 0;
        return arr[current]+findSum(arr, current+1);
    }
    public static void main(String[] args) {
        System.out.println(
            findSum(new int[]{32,43,51,68,74}, 0)
        );
    }
}
