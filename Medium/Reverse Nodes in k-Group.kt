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
    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        var lsnode : MutableList<ListNode?> = ArrayList()
        var node_temp = head
        var temp_k =k -1
        var temp_index = 0
        var temp_head = node_temp
        while(node_temp != null)
        {
            lsnode.add(node_temp)
            node_temp =node_temp.next
        }
        
        if(lsnode.count() < k)
        {
            return head
        }
        
      
        for(i in 0..(lsnode.count()-1)  )
        {
            node_temp =lsnode[temp_index*k +temp_k]            
            if(i == 0)
            {
                temp_head = node_temp
            }
            if(temp_k >0)
            {
                node_temp!!.next =lsnode[temp_index*k +(temp_k-1)]

                temp_k--
            }
            else
            {
                
                temp_k=k-1
                temp_index+=1
                if(i == lsnode.count()-1)
                {
                    node_temp!!.next = null
                }
                else 
                {
                    if(temp_index*k +(temp_k) <= lsnode.count()-1)
                    {
                        node_temp!!.next =lsnode[temp_index*k +(temp_k)]
                    }
                    else
                    {
               
                        for( j in ((temp_index-1)*k +(temp_k)+1) ..(lsnode.count()-1) )
                        {
                            node_temp!!.next = lsnode[j]
                            node_temp = node_temp!!.next 
                        }
                        return temp_head
                    }

                }
                
            }

        }
        
        return temp_head
    }
}

