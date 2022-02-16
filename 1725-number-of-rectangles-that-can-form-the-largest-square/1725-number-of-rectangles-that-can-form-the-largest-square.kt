class Solution {
    fun countGoodRectangles(rectangles: Array<IntArray>): Int {
     
        var leng = mutableListOf<Int>()
        var count = 0
        
        for(i in 0..rectangles.size-1){
            var temp = rectangles[i].min()
            leng.add(temp!!.toInt())
        }
        println("leng : ${leng}")
        
        // 개수 구하기
        var max = leng.max()!!.toInt()
        for(i in 0..leng.size-1){
            if(max == leng[i]){
                count++
            }
        }
        
        return count
        
    }
}