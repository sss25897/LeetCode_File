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
    fun middleNode(head: ListNode?): ListNode? {
      
        var fast =head
        var slow =head
        
        while(true)
        {
            if(fast!!.next ==null)
            {
                return slow
            }
            else
            {
                if(fast!!.next!!.next == null)
                {
                    return  slow!!.next
                }
            }
            
            fast = fast!!.next!!.next
            slow = slow!!.next
        }
        
        
    }
    
}