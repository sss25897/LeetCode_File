class Solution {
    fun numSquares(n: Int): Int {
        
        var dp : Array<Int> = Array<Int>(n+1){Int.MAX_VALUE}
        
        for(i in 0..n)
        {
            dp[i] = i
            var j = 1
            while(i >= j*j)
            {
                dp[i] =Math.min(dp[i],dp[i-j*j]+1)
                j++
            }
        }
        
        return dp[n]
        
    }
 
}

// dp
// 1,1,2,3



