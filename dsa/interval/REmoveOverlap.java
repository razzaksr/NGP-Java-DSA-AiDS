package interval;

import java.util.Arrays;

public class REmoveOverlap {
    public static int findAndRemove(int[][] slots){
        int count = 0;
        Arrays.sort(slots,(one,two)->one[1]-two[1]);
        int start = slots[0][1];
        for(int index=1;index<slots.length;index++){
            if(slots[index][0]<start) count++;
            else start = slots[index][1];
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(findAndRemove(
            new int[][]{{1,2},{1,3},{2,3},{3,4}}));
        System.out.println(findAndRemove(
            new int[][]{{1,2},{2,3},{3,4},{1,3}}));
        System.out.println(findAndRemove(
            new int[][]{{1,2},{1,2},{1,2}}));
        System.out.println(findAndRemove(
            new int[][]{{1,2},{2,3}}));
    }
}
