class Solution {
    fun numOfStrings(patterns: Array<String>, word: String): Int {
        
        var result = 0
        
        for(i in 0..patterns.size-1){
            if(word.contains(patterns[i])){
                result++
            }
        }
        
        return result
        
    }
}