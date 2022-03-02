class Solution {
    fun destCity(paths: List<List<String>>): String {
        
        var temp = paths[0][0]
        var i = 0
        
        while(i <= paths.size-1){
            if(temp == paths[i][0]){
                temp = paths[i][1]
                i=0
            }
            
            i++
        }
        
        return temp
    }
}