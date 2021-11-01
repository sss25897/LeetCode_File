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
    fun preorderTraversal(root: TreeNode?): List<Int> {
        var lsReturn = mutableListOf(0)
        lsReturn.remove(0)
        if(root==null) return lsReturn
        
        lsReturn.add(root.`val`)
        findvalue(root,lsReturn)
        return lsReturn.toList()
    }
    
    fun findvalue(root:TreeNode,lsReturn : MutableList<Int>)
    {
        if(root.left != null)
        {
            lsReturn.add(root.left.`val`)
            findvalue(root.left,lsReturn)
        }
         if(root.right != null)
        {
            lsReturn.add(root.right.`val`)
            findvalue(root.right,lsReturn)
        }
    }
}