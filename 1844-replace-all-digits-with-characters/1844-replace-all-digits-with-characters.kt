class Solution {
    fun replaceDigits(s: String): String {
        
        
        var num = mutableListOf<Char>()
        var alp = mutableListOf<Char>()
        var result = ""
        var temp = 0
        
        for(i in 1..s.length-1 step 2){
            num.add(s[i])
        }
        for(i in 0..s.length-1 step 2){
            alp.add(s[i])
        }
        println("num : ${num}")
        
        for(i in 0..alp.size-1){
            if(i > num.size-1){
                result += alp[i]
            }else{
                result += alp[i]
                temp = alp[i].toInt() + num[i].toString().toInt()
                result += temp.toChar()
            }
            
            
            
            println("result : ${result}")
        }
        
        return result
        
    }
}