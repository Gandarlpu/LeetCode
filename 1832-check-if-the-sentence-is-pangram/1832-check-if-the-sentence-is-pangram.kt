class Solution {
    fun checkIfPangram(sentence: String): Boolean {
        
        
        // 모든 알파벳이 적어도 한 번 이상 나타나는 문장인가?
        // 알파벳은 26개
        
        val set = mutableSetOf<Char>()
        
        for(i in 0..sentence.length-1){
            set.add(sentence[i])
        }
        println("set : ${set}")
        
        if(set.size >= 26){
            return true
        }else{
            return false
        }
        
    }
}