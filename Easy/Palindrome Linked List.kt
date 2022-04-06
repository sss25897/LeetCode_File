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
    fun isPalindrome(head: ListNode?): Boolean {
       var mtList : MutableList<Int> = ArrayList()
       var node : ListNode? = head
       while(node != null)
        {
            mtList.add(node.`val`)
            node =node!!.next
        }        
        var i=0
        var j = mtList.count() -1
        while(i < j)
        {
            if(mtList[i] != mtList[j] ) return false
            i = i+1
            j = j-1
        }
        return true
    }
}