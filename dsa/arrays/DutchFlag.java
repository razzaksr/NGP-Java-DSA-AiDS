package arrays;

import java.util.Arrays;

public class DutchFlag {
    public static void sorting(int[] nums){
        int start = 0, current = 0, end = nums.length-1;
        while(current<=end){
            if(nums[current]==0){
                // swap b/w current and start
                // current=0, start=1
                nums[current]+=nums[start];
                nums[start] = nums[current]- nums[start];
                nums[current]-=nums[start];
                current++;start++;
            }else if(nums[current]==1)
                current++;
            else{
                nums[current]+=nums[end];
                nums[end] = nums[current]- nums[end];
                nums[current]-=nums[end];
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,0,0,1,0,2,0,1};
        System.out.println("Before sorting "+Arrays.toString(nums));
        sorting(nums);
        System.out.println("After sorting "+Arrays.toString(nums));
    }
}
