class Solution {
    fun truncateSentence(s: String, k: Int): String {
        
        var result = ""
        var temp = s.split(" ")
        
        for(i in 0..k-1){
            result += temp[i]
            if(i!=k-1){
                result += " "
            }
            
        }
        
        println("result : ${result}")
        
        return result
        
    }
}