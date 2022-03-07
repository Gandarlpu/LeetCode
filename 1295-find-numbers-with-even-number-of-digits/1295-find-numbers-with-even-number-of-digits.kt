class Solution {
    fun findNumbers(nums: IntArray): Int {
        
        // 짝수 자릿수의 개수
        var result = 0
        
        for(i in 0..nums.size-1){
            var temp = nums[i].toString()
            
            if(temp.length % 2 == 0){
                // 짝수
                result++
            }
        }
        
        return result
        
    }
}