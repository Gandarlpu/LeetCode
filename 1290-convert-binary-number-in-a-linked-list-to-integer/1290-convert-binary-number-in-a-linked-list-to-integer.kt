/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun getDecimalValue(head: ListNode?): Int {
        
        var headNode = head
        //var result = mutableListOf<Int>()
        var result = ""
       
        while(headNode != null){
            
            result += headNode.`val`
            
            headNode = headNode.next
        }
        
        println("answer : ${result.toInt(2)}")
        
        
        return result.toInt(2)
        
    }
}