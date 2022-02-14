class Solution {
    fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
        
        // 먼저 reverse로 다 뒤짚고
        // 0을 1로 1을 0으로
        
        for(i in 0..image.size-1){
            image[i].reverse()
            
            for(j in 0..image.size-1){
                when(image[i][j]){
                    0 -> {
                        image[i][j] = 1
                    }
                    
                    1 -> {
                        image[i][j] = 0
                    }
                }
            }
            
            println("image : ${image[i]}")
        }
        
        return image
    }
}