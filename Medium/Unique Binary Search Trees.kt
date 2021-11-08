class Solution {
    fun numTrees(n: Int): Int {
        
        //BST's number = f(0) * f(n-1) + f(1) * f(n-2) + … + f(n-1) * f(0)
        
        var dp =  IntArray(n+1)
        dp[0] = 1
        
        for(i in 1..n)
        {
            for(j in 0..(i-1))
            {
                dp[i] += dp[j]* dp[i-j-1]
            }
        }
        
        return dp[n]
    }
  
}