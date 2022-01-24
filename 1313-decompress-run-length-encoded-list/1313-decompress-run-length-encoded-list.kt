class Solution {
    fun decompressRLElist(nums: IntArray): IntArray {
        
        var arrsize = 0
        var result = mutableListOf<Int>()
        
        var count = 0
        for(i in 0..nums.size/2-1){
            var freq = nums[2*i] // 갯수
            var value = nums[2*i+1] // 값
            
            while(freq > 0){
                
                result.add(value)
                freq--
            }
            
            println("freq : ${freq}")
            println("value : ${value}")
        }
        //println("result : ${result}")
        
     var answer : IntArray = result.toIntArray()
     
     return answer
    }
}