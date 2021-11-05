class Solution {
    fun tribonacci(n: Int): Int {
        
        var dp : MutableList<Int> = arrayListOf(0,1,1)   
        for(i in 3..n)
        {
            dp.add(dp[i-1] + dp[i-2] + dp[i-3])
        }
                
        return dp[n]
        
    }
}