class Solution {
    fun maxDepth(s: String): Int {
        
        // (와 )의 수가 같아야 함
        // 괄호 갯수
        var count = 0
        var result = 0
        
        for(i in 0 until s.length){
            if(count >= result){
                result = count
            }
            if(s[i] == '('){
                count ++
            }else if(s[i] == ')'){
                count --
            }
        }
        
        return result
        
    }
}