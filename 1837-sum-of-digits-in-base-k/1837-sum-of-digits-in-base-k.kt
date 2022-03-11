class Solution {
    fun sumBase(n: Int, k: Int): Int {
        
        
        var num = n.toString(k)
        var result = num.toString()
        var answer = 0
        
        for(i in 0..result.length-1){
            answer += Character.getNumericValue(result[i])
        }
        
        return answer
    }
}