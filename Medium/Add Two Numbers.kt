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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
       
        
        
        var current_l1 =l1
        var current_l2 =l2
        var c=0
        var sum =0
        var returnfirst = ListNode(0)
        var lsnode = returnfirst
        while(current_l1 != null || current_l2 != null || c != 0)
        {
            sum=0
            if(current_l1 == null && current_l2 != null)
            {
                 sum +=(c + current_l2.`val`) % 10
                 c=(c + current_l2.`val`)/10
                 current_l2=current_l2.next
                lsnode.next = ListNode(sum%10)
                lsnode=lsnode.next
                 continue
            }
                  
            
            if(current_l2 == null && current_l1 != null )
            {
                 sum +=(c + current_l1.`val`) % 10
                 c=(c + current_l1.`val`)/10             
                 current_l1=current_l1.next
                lsnode.next = ListNode(sum%10)
                lsnode=lsnode.next
                 continue
            }
            
            
            if(current_l2 == null && current_l1 == null)
            {
                sum += c
                lsnode.next = ListNode(sum%10)
                lsnode=lsnode.next
                c=0
                continue
            }
                

                sum +=(current_l1!!.`val` + current_l2!!.`val` + c) % 10
                c=(current_l1!!.`val` + current_l2!!.`val`+c)/10
                current_l1=current_l1.next
                current_l2=current_l2.next
                lsnode.next = ListNode(sum%10)
                lsnode=lsnode.next
        }
        

        return returnfirst.next
             
        
    }
}