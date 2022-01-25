class Solution {
    fun balancedStringSplit(s: String): Int {
        
        var s = s
        var R_count = 0
        var L_count = 0
        var result = 0
        
        for(i in 0..s.length-1){
            when(s[i]){
                'R' -> {
                    R_count ++
                }
                'L' -> {
                    L_count ++
                }
            }
            
            if(R_count != 0 && L_count != 0){
                if(R_count == L_count){
                    result ++
                    println("result : ${result}")
                }
            }
            
        }
        
        
        
        return result
    }
}