package dp;

public class DecodeViaDP {
    public static int numDecodings(String str) {
        if (str == null || str.length() == 0) return 0;
        int size = str.length();
        int[] dp = new int[size + 1];
        dp[0] = 1; // base case: empty string

        // First character must not be '0'
        dp[1] = str.charAt(0) != '0' ? 1 : 0;

        for (int i = 2; i <= size; i++) {
            // Single digit decode
            int one = str.charAt(i - 1) - '0';
            if (one >= 1 && one <= 9) {
                dp[i] += dp[i - 1];
            }

            // Two digit decode
            int two = Integer.parseInt(str.substring(i - 2, i));
            if (two >= 10 && two <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[size];
    }

    public static void main(String[] args) {
        System.out.println(numDecodings("12"));    // 2
        System.out.println(numDecodings("226"));   // 3
        System.out.println(numDecodings("06"));    // 0
        System.out.println(numDecodings("11106")); // 2
    }
}
