Maximum Depth of Binary Tree


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
    fun maxDepth(root: TreeNode?): Int {
        
        var deep_left =0
        var deep_right =0
        
        if(root == null) return 0
        
        deep_left = maxDepth(root.left)+1
        deep_right = maxDepth(root.right)+1
        if(deep_left >deep_right) return deep_left
        return deep_right
    }
}