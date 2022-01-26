/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    
    var result = 0
    
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        
        val root = root
        
        preOrder(root , low , high)
        
        
        return result
        
    }
    
    fun preOrder(root: TreeNode? , low : Int , high : Int) {
        
        if(root != null){
            println("root : ${root?.`val`}")
            if(root?.`val` >= low && root?.`val` <= high){
                result += root?.`val`
            }
        }
        
        if(root?.left != null) {
            
            // if(root?.`val` >= low) {
            //     result += root?.`val`
            // }
            
            preOrder(root?.left , low , high) 
        }
        
        if(root?.right != null) { 
            
            // if(root?.`val` <= high){ 
            //     result += root?.`val`
            // }
            
            preOrder(root?.right , low , high) 
        }
        
    }
    
    
}