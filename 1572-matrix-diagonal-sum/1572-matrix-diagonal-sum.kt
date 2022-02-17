class Solution {
    fun diagonalSum(mat: Array<IntArray>): Int {
        
        var result = 0
        var result2 = 0
        var j = mat.size-1
        
        
        // primary diagonal
        for(i in 0..mat.size-1){
            result += mat[i][i]
        }
        println("pri result : ${result}")
        
        // secondary diagonal
        for(i in 0..mat.size-1){
            result += mat[j][i]
            
            j--
        }
        //println("secon result : ${result2}")
        
        // 가운데 겹치는 부분 빼주기
        
        if(mat.size % 2 != 0){
            var temp = mat.size / 2
            result -= mat[temp][temp]
        }
        
        return result
    }
}