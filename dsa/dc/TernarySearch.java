package dc;

public class TernarySearch {
    public static int performSearch(int[] arr, 
        int start, int end, int user){
        while(start<=end){
            int mid1 = start+(end-start)/3;
            int mid2 = end-(end-start)/3;
            if(user==arr[mid1]) return mid1;
            if(user==arr[mid2]) return mid2;
            // portion1
            if(arr[mid1]>user) end = mid1-1;
            // portion3
            else if(arr[mid2]<user) start = mid2+1;
            // portion2
            else{start = mid1+1;end = mid2-1;}
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {32,43,51,68,74};
        System.out.println(performSearch(
            arr, 0, arr.length-1, 32));
        System.out.println(performSearch(
            arr, 0, arr.length-1, 51));
        System.out.println(performSearch(
            arr, 0, arr.length-1, 52));
        System.out.println(performSearch(
            arr, 0, arr.length-1, 68));
    }
}
