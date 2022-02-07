class Solution {
    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
        
        var word_1 = ""
        var word_2 = ""
        var result = false
        
        for(i in 0..word1.size-1){
            word_1 += word1[i]
        }
        for(i in 0..word2.size-1){
            word_2 += word2[i]
        }
        
        if(word_1.length == word_2.length){
            for(i in 0..word_1.length-1){
                if(word_1[i] == word_2[i]){
                    result = true
                }else{
                    result = false
                }
            }
            
        }else{
            result = false
        }
        
        return result
    }
}