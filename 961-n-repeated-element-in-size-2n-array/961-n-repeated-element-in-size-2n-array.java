class Solution {
    public int repeatedNTimes(int[] nums) {
        
        HashMap<Integer , Integer> mp = new HashMap();
        
        for(int i = 0 ; i < nums.length ; i ++){
            if(!mp.containsValue(nums[i])){
                mp.put(i , nums[i]);
            }else{
                return nums[i];
            }
        }
        
    
        return 0;
    }
}