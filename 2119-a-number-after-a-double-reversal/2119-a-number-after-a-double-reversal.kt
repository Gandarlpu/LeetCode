class Solution {
    fun isSameAfterReversals(num: Int): Boolean {
        
        var num = num.toString()
        var reverse_1 = num.reversed().toInt()
        var reverse_2 = reverse_1.toString().reversed()
        
        if(reverse_2 == num.toString()){
            return true
        }else{
            return false
        }
        
        
        
    }
}