class Solution {
    fun reverseWords(s: String): String {
        
        var result = ""
        var arr = s.split(" ")
        
        for(i in 0..arr.size-1){
            result += arr[i].reversed()
            if(i == arr.size-1){
                break
            }
            result += " "
        }
        
        return result
    }
}