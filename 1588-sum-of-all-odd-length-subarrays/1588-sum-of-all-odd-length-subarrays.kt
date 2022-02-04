class Solution {
    fun sumOddLengthSubarrays(arr: IntArray): Int {
        
        
        
        //var copyArray3 = tempArray.copyOfRange(2, 5)
        var count = 1
        var result = 0
        
        while(count <= arr.size){
            
            var i = 0
            while(i+count <= arr.size){
                var str = arr.copyOfRange(i , i+count)
                result += str.sum()
                i++
            }
            
            count += 2
        }
        
        
        
        return result
        
    }
}