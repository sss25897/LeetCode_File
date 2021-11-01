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
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        
        if(head == null )return null
        var node : ListNode? =ListNode(0)
        node!!.next=head
        var slow =node
        var fast =head
        
        for(i in 1..n)
        {

                fast=fast!!.next        
        }
        
        
        while(fast!= null)
        {
            slow=slow!!.next
            fast = fast!!.next
        }

        slow!!.next = slow!!.next!!.next

        return node.next
        
        
    }
}