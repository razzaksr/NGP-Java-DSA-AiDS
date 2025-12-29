package dp;

import java.util.Arrays;

public class CoinChange {
    // target is 1100, dp[1100]
    public static int count(int[] dom, int target){
        int initial = target+1;
        int[] dp = new int[initial];
        Arrays.fill(dp, initial);
        dp[0]=0;
        for(int cash:dom){
            for(int index = cash; index<=target;index++){
                dp[index]=Math.min(dp[index], 
                    dp[index-cash]+1);
            }
        }
        if(dp[target]<initial) return dp[target];
        else return -1;
        // return (dp[target]<target+1)?dp[target]:-1;
    }
    public static void main(String[] args) {
        int received = 0;
        received =count(new int[]{100,500,200}, 1100);
        System.out.println(received);
        received = count(new int[]{100,500,200}, 8700);
        System.out.println(received);
        received = count(new int[]{500,200}, 100);
        System.out.println(received);
        received = count(new int[]{500,200}, 1100);
        System.out.println(received);
        received = count(new int[]{500,200}, 1300);
        System.out.println(received);
        received = count(new int[]{500,200}, 400);
        System.out.println(received);
        received = count(new int[]{500,200}, 150);
        System.out.println(received);
    }
}
