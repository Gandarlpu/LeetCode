class Solution {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        
        
        var count = 0
        var count_1 = 0
        
        //정렬
        for(i in 0..words.size-1){
            var temp = words[i].length-1
            for(j in 0..temp){
                if(allowed.contains(words[i][j])  ){
                    count++
                } 
            }
            println("count : ${count} , words : ${words[i].length}")
            if(count == words[i].length){
                count_1++
            }
            count = 0
        }
        
        return count_1
        
    }
}