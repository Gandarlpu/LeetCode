import kotlin.math.abs

class Solution {
    fun countKDifference(nums: IntArray, k: Int): Int {
        
        // 배열의 수들을 빼서 절대값 k가 몇개 나오는지
        var result = 0
        var temp = 0
        
        for(i in 0 until nums.size){
            for(j in i until nums.size){
                temp = nums[i] - nums[j]    
                temp = abs(temp)
                if(temp == k){
                    result ++
                }
            }
        }
        
        return result
        
    }
}