
//Dynamic Programming solution
class Solution {
    fun fib(n: Int): Int {
        
        var dp :MutableList<Int> = MutableList(n+1){1}
        dp[0] =0
        
        for(i in 2..n)
        {
            dp[i] = dp[i-1] + dp[i-2]
        }
        return dp[n]
        
        
    }
}