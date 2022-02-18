class Solution {
    fun findGCD(nums: IntArray): Int {
        
        var max = nums.max()!!.toInt()
        var min = nums.min()!!.toInt()
        var result = gcd(max , min)
        
        
        return result
        
    }
    
    fun gcd(max : Int , min : Int) : Int {
        if(min != 0){
            return gcd(min , max % min)
        }else{
            return max
        }
        
    }
}