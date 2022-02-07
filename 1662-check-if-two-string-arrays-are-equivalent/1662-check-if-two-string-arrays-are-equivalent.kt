class Solution {
    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
        
        var word_1 = StringBuilder()
        var word_2 = StringBuilder()
        
        word1.forEach{
            word_1.append(it)
        }
        word2.forEach{
            word_2.append(it)
        }
        println("word_1 : ${word_1}")
        println("word_2 : ${word_2}")
        
        return word_1.toString() == word_2.toString()
        
        
    }
}