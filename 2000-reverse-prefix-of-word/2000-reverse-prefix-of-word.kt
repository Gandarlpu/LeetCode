class Solution {
    fun reversePrefix(word: String, ch: Char): String {
        
        
        var reverse = word.substring(0 , word.indexOf("${ch}")+1).reversed()
        var remain = word.substring(word.indexOf("${ch}")+1 , word.length)
        
        return "${reverse+remain}"
        
        
    }
}