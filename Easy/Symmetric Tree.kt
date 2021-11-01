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
    fun isSymmetric(root: TreeNode?): Boolean {
        if(root == null) return true
        return isSymmetric(root.left,root.right)
    }
    
    fun isSymmetric(leftNode: TreeNode?,rightNode : TreeNode?): Boolean{
        if(leftNode == null && rightNode == null) return true
        if(leftNode == null || rightNode == null) return false
        
        if(leftNode.`val` != rightNode.`val`)return false
        return ( isSymmetric(leftNode.left,rightNode.right) &&  isSymmetric(leftNode.right,rightNode.left) )
    }
}