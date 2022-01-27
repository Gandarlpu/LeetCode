class Solution {
    fun sortSentence(s: String): String {
        
        // 숫자는 항상 문자열의 마지막에 있다.
        // 숫자는 index
        // 숫자 지워주기
        
        var array = s.split(" ")
        var result = Array(array.size , {i -> ""})
        
        for(i in 0..array.size-1){
            var num = array[i].substring(array[i].length-1).toInt()-1 // 2
            var str = array[i].substring(0, array[i].length-1) // is
            var temp = array[num] // This1
            
            result[num] = str
            //array[i] = temp
            
            // println("num : ${num+1}")
            // println("array[i] = ${array[i]}")
            
        }
        
        for(i in 0..result.size-1){
            println("result : ${result[i]}")
        }
        
        return result.joinToString(separator = " ")
    }
}