class Solution {
    fun largestAltitude(gain: IntArray): Int {
     
        var hei = 0
        var hei_list = mutableListOf<Int>()
        
        hei_list.add(hei)
        
        for(i in 0..gain.size-1){
            hei += gain[i]
            
            hei_list.add(hei)
        }
        println("hei : ${hei_list.max()}")
        var result = hei_list.max()
        
        return result!!.toInt()
        
    }
}