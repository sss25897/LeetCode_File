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
    fun swapPairs(head: ListNode?): ListNode? {
        //head null process
       if(head == null) return null
       if(head!!.next == null)  return head
       return swap_Recursion(head,head!!.next)
         
    }
    
    fun swap_Recursion(prev : ListNode?,next: ListNode?) : ListNode?
    {

        if(prev == null) return null
        if(next == null) return prev
      
        var node_temp = next!!.next//Get 3rd node
        next!!.next =prev        
        
        if(node_temp != null)
        {
          prev!!.next = swap_Recursion(node_temp,node_temp!!.next)  
        }
        else
        {
             prev!!.next = swap_Recursion(node_temp,null)
        }
        
              
        
        return next
        
    }
}