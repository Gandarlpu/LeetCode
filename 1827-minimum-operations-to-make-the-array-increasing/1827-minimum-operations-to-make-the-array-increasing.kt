class Solution {
    fun minOperations(nums: IntArray): Int {
        
        var nums = nums
        var result = 0
        var cnt = 0
        
        for(i in 1..nums.size-1){
            if(nums[i-1] > nums[i]){
                var temp = nums[i-1] - nums[i]
                for(j in 0..temp){
                    cnt++
                }
            }else if(nums[i-1] == nums[i]){
                cnt++
            }
            println("cnt : ${cnt} , nums : ${nums[i]}")
            nums[i] += cnt
            result += cnt
            cnt=0
        }
        
        return result
        
    }
}