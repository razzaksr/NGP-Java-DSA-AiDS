package dc;

public class PerfectSquareViaDC {
    public static boolean isPerfect(int number){
        if(number<2&&number>=0) return true;
        long start = 0, end = number/2;
        long mid = 0, square = 0;
        while(start<=end){
            mid = start + (end - start) / 2;
            square = mid*mid;
            if(square==number) return true;
            else if(square<number) start = mid+1;
            else end = mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPerfect(16));
        System.out.println(isPerfect(14));
        System.out.println(isPerfect(1296));
        System.out.println(isPerfect(4));
        System.out.println(isPerfect(13));
        System.out.println(isPerfect(9804));
        System.out.println(isPerfect(-10));
    }
}
