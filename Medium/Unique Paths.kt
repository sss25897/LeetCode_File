class Solution {
    fun uniquePaths(m: Int, n: Int): Int {
        var dp : MutableList<MutableList<Int>> =ArrayList()
        
        for(i in 0..(m-1))
        {
            var dp_n : MutableList<Int> =ArrayList()
            for(j in 0 ..(n-1))
            {
              if(i == 0)
              {
                dp_n.add(1)    
              }
              else if(j == 0 && i !=0)
              {
                dp_n.add(1)    
              }
              else if(j!=0 && i!=0)
              {
                dp_n.add(dp_n[j-1] + dp[i-1][j])    
              }             
            }
            dp.add(dp_n)
        }
        
        return dp[m-1][n-1]
    }
}