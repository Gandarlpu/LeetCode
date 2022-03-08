class Solution {
    fun areOccurrencesEqual(s: String): Boolean {
        
        // 정렬해서? 아니면 같은 문자 개수가 같으면
        var arr = mutableListOf<Int>()
        
        for(i in 0..s.length-2){
            var temp = s[i]
            var cnt = 0
            for(j in 0..s.length-1){
                if(temp == s[j]){
                    cnt++
                }
            }
            arr.add(cnt)
        }
        println("arr : ${arr}")
        
        var result = arr.distinct()
        println("resut : ${result}")
        if(result.size > 1){
            return false
        }else{
            return true
        }
        
        
        
    }
}