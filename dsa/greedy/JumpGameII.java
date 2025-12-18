package greedy;

public class JumpGameII {
    public static int viaN(int[] arr){
        int jumps =0 , currentEnd = 0, dist = 0;
        for(int index = 0;index < arr.length-1; index++){
            dist = Math.max(dist, index+arr[index]);
            if(index==currentEnd){
                jumps++;
                currentEnd = dist;
                if(currentEnd<=index) return -1;
            }
        }
        return jumps;
    }
    public static void main(String[] args) {
        System.out.println(viaN(new int[]{2,3,1,1,4}));
        System.out.println(viaN(new int[]{2,3,0,1,4}));
        System.out.println(viaN(new int[]{3,2,1,0,4}));
        System.out.println(viaN(new int[]{3,4,2,1}));
    }
}
