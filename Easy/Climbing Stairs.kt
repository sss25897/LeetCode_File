class Solution {
    fun climbStairs(n: Int): Int {
        var prev =1
        var cur =1
        var sum=0
        if(n<2) return 1
        for(i in 2..n)
        {
            
            sum=prev + cur
            cur=prev
            prev=sum
        }
        return sum
        
    }
}