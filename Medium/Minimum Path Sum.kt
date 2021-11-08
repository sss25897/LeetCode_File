class Solution {
    fun minPathSum(grid: Array<IntArray>): Int {
        var dp : Array<Array<Int>> = Array(grid.count()+1, { Array(grid[0].count()+1, {0}) })
        var m =dp.count() -1
        var n =dp[0].count() -1
        
        
        for(i in 1..m)
        {
            for(j in 1..n)
            {
                if(i ==1 && j ==1)
                {
                    dp[i][j] = grid[i-1][j-1] // first pointer
                }
                else if(i ==1)
                {
                    dp[i][j] =  dp[i][j-1]  + grid[i-1][j-1]  // column 0
                }
                else if (j ==1)
                {
                   dp[i][j] =  dp[i-1][j]  + grid[i-1][j-1]  // row 0
                }
                else
                {
                  dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) + grid[i-1][j-1]  
                }
                
            }
        }
        
        return dp[m][n]
    }
}