class Solution {
    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        var dp : MutableList<MutableList<Int>> =ArrayList()
        var m =obstacleGrid.count()-1
        var n =obstacleGrid[0].count()-1
        var first = 0
        
        //init
        if(obstacleGrid[0][0] ==0)
        {
          first =1  
        }
             
        for(i in 0..m )
        {
            var dp_n : MutableList<Int> =ArrayList()          
            for(j in 0 ..n)
            {

              if(i ==0 && j ==0)
              {
                dp_n.add(first) //first pointer  
              }  
              else if(obstacleGrid[i][j] == 1)
              {
                dp_n.add(0)//  obstacles pointer
              }
              else if(i == 0 && obstacleGrid[i][j] != 1)
              {
                dp_n.add(dp_n[j-1])  // first rows value add, paths = last paths
              }
              else if(j == 0 && i !=0 && obstacleGrid[i][j] != 1)
              {
                dp_n.add(dp[i-1][0]) //first columns value add, paths = last paths   
              }
              else if(j!=0 && i!=0 && obstacleGrid[i][j] != 1)
              {
                dp_n.add(dp_n[j-1] + dp[i-1][j])    
              }             
            }
            dp.add(dp_n)
        }
        
        return dp[m][n]
    }
}