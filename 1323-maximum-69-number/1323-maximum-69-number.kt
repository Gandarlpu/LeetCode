class Solution {
    fun maximum69Number (num: Int): Int {
        
        var result = StringBuilder()
        result.append(num.toString())
        
        if(result.length > 1){
            for(i in 1..result.length-1){
                if(result[i-1] > result[i]){
                    result[i] = '9'
                    break
                }else if(result[i-1] < result[i]){
                    result[i-1] = '9'
                    break
                }else if(result[i-1] == '6' || result[i] == '6'){
                    result[i-1] = '9'
                    break
                }
            }
        }else{
            result[0] = '9'
        }
        
        
        println("result : ${result}")
    
        return result.toString().toInt()
        
    }
}