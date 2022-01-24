class Solution {
    fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
        
        //var result = IntArray(nums.size , {i -> i})
        var result = mutableListOf<Int>()
        
        for(i in 0..nums.size-1){
            result.add(index[i] , nums[i])
            println("result : ${result}")
        }
        
        
        return result.toIntArray()
    }
}