class Solution {
    fun freqAlphabets(s: String): String {
     
        var ai = HashMap<String , String>()
        var a = 'a'
        var result = ""
        
        // 맵 초기화
        ai.put("0", "null")
        for(i in 1..26){
            if(i < 10){
               ai.put(i.toString() , "${(a.toInt()+i-1).toChar()}") 
            }else{
               ai.put(i.toString()+"#" , "${(a.toInt()+i-1).toChar()}")   
            }
        }
        println("ai : ${ai}")
        
        var i = s.length-1
        while(i >= 0){
            var temp = ""
            if(s[i] == '#'){
                temp += s[i-1]
                temp += s[i-2]
                temp = temp.reversed()
                temp += '#'
                i -= 2
                println("temp : ${temp}")
            }else{
                temp += s[i]    
            }
            result += ai.get(temp)
            
            i--
        }
        
        
        return result.reversed()
    }
}