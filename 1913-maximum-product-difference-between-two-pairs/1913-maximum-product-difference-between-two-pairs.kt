class Solution {
    fun maxProductDifference(nums: IntArray): Int {
        
        //곱이 제일 큰 수와 제일 작은 수 구해서 뺴주기
        
        var temp_big = 0
        var temp_small = 0
        
        for(i in 0..nums.size-2){
            for(j in (i*1)+1..nums.size-1){
                var temp = nums[i] * nums[j]
                
                if(temp_small == 0){
                    temp_small = temp
                }
                
                if(temp_big < temp){
                    temp_big = temp
                }
                
                if(temp_small > temp){
                    temp_small = temp
                }
            }
        }
        println("big : ${temp_big} , small : ${temp_small}")
        
        return temp_big - temp_small
        
    }
}