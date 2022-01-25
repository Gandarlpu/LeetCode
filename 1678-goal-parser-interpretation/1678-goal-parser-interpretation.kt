class Solution {
    fun interpret(command: String): String {
     
        var command = command
        var result = ""
        
        for(i in 0..command.length-1){
            result = command.replace("()" , "o")
        }
        for(i in 0..result.length-1){
            result = result.replace("(al)" , "al")
        }
        
        return result
    }
}