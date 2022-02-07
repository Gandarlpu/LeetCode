class Solution {
    fun numberOfMatches(n: Int): Int {
        
        // 현재 팀 수가 짝수이면 각 팀이 다른 팀과 짝을 이룹니다. 
        // 총 n/2 경기가 진행되며 n/2 팀이 다음 라운드에 진출합니다.
        
        // 현재 팀 수가 홀수일 경우 한 팀이 무작위로 토너먼트에 진출하고 나머지 팀이 짝을 이룹니다. 
        // 총 (n - 1) / 2 경기가 진행되며 (n - 1) / 2 + 1 팀이 다음 라운드에 진출합니다.
        
        var temp = n
        var result = 0
        while(temp > 1){
            println("result : ${result}")
            println("temp : ${temp}")
            
            if(temp % 2 == 0){
                temp = temp/2
                result += temp
                
            }else{
                result += ((temp-1)/2)+1
                temp = (temp-1)/2
            }
            
        }
        
        return result
        
    }
}