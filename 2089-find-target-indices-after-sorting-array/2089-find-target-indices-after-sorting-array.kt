class Solution {
    fun targetIndices(nums: IntArray, target: Int): List<Int> {
        
        
        // nums 정렬
        // target을 index로 하는 이전 배열 만들어서 반환
        // value값이 같은게 잇으면 해당 index
        // map써보자
        nums.sort()
        var answer = mutableListOf<Int>()
        
        for(i in 0..nums.size-1){
            if(nums[i] == target){
                answer.add(i)
            }
        }

        
        return answer
    }
}