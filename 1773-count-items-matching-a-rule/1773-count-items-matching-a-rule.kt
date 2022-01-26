class Solution {
    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {

        var result = 0
        var key = listOf("type" , "color" , "name")
        var type = key.indexOf(ruleKey)
        
        
        for(i in 0..items.size-1){
            if(items[i][type] == ruleValue){
                result ++
            }
        }
        
        
        return result
    }
}