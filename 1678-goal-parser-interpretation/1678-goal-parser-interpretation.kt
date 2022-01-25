class Solution {
    fun interpret(command: String): String {
     
        var command = command
        var result = ""
        
        result = command.replace("()" , "o")
        result = result.replace("(al)" , "al")
        
        return result
    }
}