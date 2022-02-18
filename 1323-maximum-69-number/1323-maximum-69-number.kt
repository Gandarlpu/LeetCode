class Solution {
    fun maximum69Number (num: Int): Int {
        
        var result = StringBuilder()
        result.append(num.toString())
        
        for(i in 0..result.length-1){
            if(result[i] == '6'){
                result[i] = '9'
                break
            }
        }
        
        println("result : ${result}")
    
        return result.toString().toInt()
        
    }
}