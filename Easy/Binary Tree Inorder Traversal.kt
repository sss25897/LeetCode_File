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
    fun inorderTraversal(root: TreeNode?): List<Int> {
        var stack_out =Stack<TreeNode>()
        var output_arr =ArrayList<Int>()
        if(root == null) return output_arr
        
        var curr= root
        while(curr!= null || !stack_out.isEmpty())
        {
            while(curr!= null)
            {
                stack_out.push(curr)
                curr=curr.left
            }
            curr=stack_out.pop()
            output_arr.add(curr.`val`)
            curr=curr.right
        }
        
        return output_arr
    }
}