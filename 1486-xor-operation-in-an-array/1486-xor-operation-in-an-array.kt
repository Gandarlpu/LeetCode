class Solution {
    fun xorOperation(n: Int, start: Int): Int {
        
        // n == nums.length
        
        var str = IntArray(n , {i -> 0})
        var result = 0
        
        for(i in 0..str.size-1){    
            str[i] = start+2*i
            //println("str : ${str[i]}")
        }
        
        for(i in 0..str.size-1){
            
            if(result != null){
                println("result : $result , str[i] : ${str[i]}")
                result = str[i] xor result
            }else{
                result = str[i]    
            }
            
        }
        
        return result
        
    }
}