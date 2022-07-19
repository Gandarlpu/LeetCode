import java.util.*;

class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        
        for(int i = 1 ; i < nums.length ; i = i + 2){
            if(nums[i-1] != nums[i]){
                System.out.println("i-1 : " + nums[i-1]);
                System.out.println("i : " + nums[i]);
                
                return false;
            }
        }
        return true;
        
        
    }
}