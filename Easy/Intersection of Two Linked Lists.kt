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
    fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
        //this solution use list to record listnode that has been visited
        var lsrecord : MutableList<ListNode> = ArrayList()
        var _headA = headA
        var _headB = headB
        if(headA ==null || headB ==null) return null
        
        while(_headA != null  || _headB != null)
        {
            
            if(lsrecord.contains(_headA))
            {
                return _headA
            }
            if(_headA != null)
            {
                lsrecord.add(_headA)
                _headA = _headA.next
            }
            
            if(lsrecord.contains(_headB))
            {
                return _headB
            }
            if(_headB != null)
            {
                lsrecord.add(_headB)
                _headB = _headB.next
            }
            
        }
        return null
    }
}


//best solution
//check length of linklist and skip the longer list's start node
//let two linklistes.length are same.
//step two list,if nodeA == nodeB,this node is answer