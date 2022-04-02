class Solution {
    fun isHappy(n: Int): Boolean {
        
        var memo: MutableSet<Int> = hashSetOf()
        return isHappyRun(n,memo)
    }
    
    fun isHappyRun(n:Int,memo:MutableSet<Int>) : Boolean
    {
        var now_n = n
        if(memo.contains(n))
        {
            return false
        }        
        if(n ==1)
        {
            return true
        }
        memo.add(n)
        
        var next_n=0
        while(now_n >0)
        {
            next_n = next_n + (now_n%10) * (now_n%10)
            now_n=now_n/10
        }
        return isHappyRun(next_n,memo)
    }
}