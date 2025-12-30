package dp;

public class EditDistance {
    public static int findMin(String wrd1, String wrd2){
        int rSize = wrd1.length();
        int cSize = wrd2.length();
        if(rSize==0||cSize==0) return 0;
        int[][] dp = new int[rSize+1][cSize+1];
        for(int row=0;row<=rSize;row++) dp[row][0]=row;
        for(int col=0;col<=cSize;col++) dp[0][col]=col;
        for(int row=1;row<=rSize;row++){
            for(int col=1;col<=cSize;col++){
                if(wrd1.charAt(row-1)==wrd2.charAt(col-1))
                    dp[row][col] = dp[row-1][col-1];
                else
                    dp[row][col]= 1 + Math.min(
                        dp[row-1][col-1],
                                Math.min(dp[row-1][col],
                                    dp[row][col-1]));
            }
        }
        return dp[rSize][cSize];
    }
    public static void main(String[] args) {
        System.out.println(findMin("horse", "ros"));
        System.out.println(findMin("intention", "execution"));
        System.out.println(findMin("horse", "rose"));
        System.out.println(findMin("madam", "mam"));
    }
}
