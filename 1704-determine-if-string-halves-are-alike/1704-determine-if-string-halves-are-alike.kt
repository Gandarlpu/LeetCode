class Solution {
    fun halvesAreAlike(s: String): Boolean {
       
        val vowels = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        val splitArr = s.chunked(s.length / 2)
        
        val left = splitArr[0].count { it in vowels }
        val right = splitArr[1].count { it in vowels }
        
        return left == right
        
    }
}