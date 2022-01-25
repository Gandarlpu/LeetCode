class Solution {
    fun validMountainArray(arr: IntArray): Boolean {
        
        var arr = arr
        var max = arr.max()
        var count = 0
        var result = false
        
        for(i in 0..arr.size-1){
            if(arr[i] == max){
                break
            }else{
                count++   
            }
        }
        println("count : ${count}")
        
        if(count <= 0 || count == arr.size-1){
            return false
        }
        
        //정상까지 올라가기
        for(i in 1..count){
            if(arr[i-1] >= arr[i]){
                return false
            }else{
                result = true
            }
        }
        
        // true일 때
        for(i in count+1..arr.size-1){
            if(arr[i-1] <= arr[i]){
                return false
            }else{
                result = true
            }
        }
        
        return result
    }
}