class Solution {
    fun prefixCount(words: Array<String>, pref: String): Int {
        
        var result = 0
        
        for(i in 0..words.size-1){
            if(words[i].length >= pref.length){
                var temp = words[i].substring(0 , pref.length)
                println("temp : ${temp}")
                
                if(temp == pref){
                    result++
                } 
            }
        }
        
        return result
    }
}