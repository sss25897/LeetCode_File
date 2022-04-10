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
    fun sumOfLeftLeaves(root: TreeNode?): Int {
        var sum: Int =0
        sum = TreeInterval(root,sum,false)
        return sum
    }
    
    fun TreeInterval(root: TreeNode?,sum : Int,IsLeft: Boolean): Int {
        
        var tpsum = sum
        if(root==null )return sum
        if(root!!.left ==null  && root!!.right == null && IsLeft==true) return sum + root!!.`val`
        
        tpsum = TreeInterval(root!!.right,tpsum,false)
        tpsum = TreeInterval(root!!.left,tpsum,true)
        
        return tpsum
        
    }
}