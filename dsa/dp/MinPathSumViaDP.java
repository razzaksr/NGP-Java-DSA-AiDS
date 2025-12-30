package dp;

public class MinPathSumViaDP {
    public static int findMinPath(int[][] grid){
        int rSize = grid.length;
        int cSize = grid[0].length;
        for(int row=1;row<rSize;row++) 
            grid[row][0]+=grid[row-1][0];
        for(int col=1;col<cSize;col++) 
            grid[0][col]+=grid[0][col-1];
        for(int row=1;row<rSize;row++){
            for(int col=1;col<cSize;col++){
                grid[row][col]+=Math.min(
                    grid[row-1][col],
                    grid[row][col-1]);
            }
        }
        return grid[rSize-1][cSize-1];        
    }
    public static void main(String[] args) {
        System.out.println(findMinPath(new int[][]{
            {1,3,1},
            {1,5,1},
            {4,2,1}
        })); //7
        System.out.println(findMinPath(new int[][]{
            {1,2,3},
            {4,5,6}
        })); //12
    }
}
