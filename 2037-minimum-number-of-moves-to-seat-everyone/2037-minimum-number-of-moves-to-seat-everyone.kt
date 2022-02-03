import kotlin.math.*

class Solution {
    fun minMovesToSeat(seats: IntArray, students: IntArray): Int {
        
        var i = 0
        var j = 1
        var result = 0
        
        
        seats.sort()
        students.sort()
        
        for(i in 0 until seats.size){
            var temp = abs(seats[i]-students[i])
            result += temp
            println("temp : ${temp}")
        }
        
        
        return result
        
    }
}