class Solution {
    public int sumOfUnique(int[] nums) {
        
        int[] freq = new int[101];
        int result = 0;
        
        // 100개 배열에서 nums에 담긴 요소들의 idx값을 하나씩 늘려줌
        for(int i = 0 ; i < nums.length ; i++){
            freq[nums[i]]++;
        }
        
        // 늘려준 idx값들이 1이상이면 2개 이상이 있는 것
    
        for(int i = 1 ; i < 101 ; i ++){
            if(freq[i] == 1){
                result += i;
            }
        }
        
        return result;
    }
}