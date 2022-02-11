class Solution {
    fun firstPalindrome(words: Array<String>): String {
        
        var result = ""
        var flag = false
        
        
        for(i in 0..words.size-1){
            var temp = words[i]
            
            for(j in 0..(temp.length-1)/2){
                if(temp.length == 1){
                    result = temp
                    break
                }
                if(temp[j] != temp[(temp.length-1)-j] && j != (temp.length-1)-j){
                    result = ""
                    break
                }else{
                    result = temp
                }
              
            }
            
            if(result != ""){
                break
            }
        }
        
        return result
    }
}