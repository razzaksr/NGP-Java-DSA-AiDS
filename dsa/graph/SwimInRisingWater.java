package graph;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Box{
    int row, column, height;
    public Box(int row, int col, int ht){
        this.row = row; this.column = col;this.height=ht;
    }
}

public class SwimInRisingWater {
    public static int findTime(int[][] grid){
        int size = grid.length;
        boolean[][] visited = new boolean[size][size];
        Queue<Box> queue = new PriorityQueue<>(
            Comparator.comparingInt(obj->obj.height)
        );
        int maximum = 0;
        queue.offer(new Box(0,0,grid[0][0]));
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!queue.isEmpty()){
            Box polled = queue.poll();
            maximum = Math.max(maximum, polled.height);
            if(polled.row == size-1 && polled.column==size-1)
                return maximum;
            for(int[] dir: directions){
                int neiRow  = polled.row+dir[0];
                int neiCol = polled.column + dir[1];
                if(neiRow>=0&&neiRow<size&&neiCol>=0&&neiCol<size&&!visited[neiRow][neiCol]){
                    visited[neiRow][neiCol]=true;
                    queue.offer(new Box(neiRow,neiCol,grid[neiRow][neiCol]));
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] grid = {
            {0,1,2,3,4},
            {24,23,22,21,5},
            {12,13,14,15,16},
            {11,17,18,19,20},
            {10,9,8,7,6}
        };
        int received = SwimInRisingWater.findTime(grid);
        System.out.println(received);
        int[][] grid2={{0,2},{1,3}};
        received = SwimInRisingWater.findTime(grid2);
        System.out.println(received);
    }
}
