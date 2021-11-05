class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        
        var _step =1
        var dp : MutableList<Int> = MutableList(cost.count()){0}
        
        if(cost.count() <2 ) return 0
        
        
        for(i in 0.._step)
        {
            dp[i] =cost[i] //fist step,min cost = cost[i]
        }
              
        for(i in 2..(cost.count()-1) )
        {
            dp[i] =Math.min(dp[i-1],dp[i-2]) + cost[i] 
        }
        

        return Math.min(dp[cost.count()-1],dp[cost.count()-2])      


    }
}