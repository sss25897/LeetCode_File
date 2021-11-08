class Solution {
    fun minimumTotal(triangle: List<List<Int>>): Int {
        
        if(triangle.count()==1) return triangle[0][0]
        var min = Int.MAX_VALUE
        var dp : MutableList<MutableList<Int>> = ArrayList()
        
        
        
        for(i in 0..(triangle.count()-1))
        {
            dp.add(triangle[i].toMutableList())// add triangle value to dp_triangle
            for(j in 0..i)
            {
                if(i ==0)
                {
                  dp[0][0] = triangle[0][0]  
                }
                else if(j ==0 && i>0)
                {
                   dp[i][j] =triangle[i][j] + dp[i-1][j]//left value
                }
                else if(j == i && i>0 )
                {
                   dp[i][j] =triangle[i][j] + dp[i-1][j-1]  //right value
                }
                else
                {
                   dp[i][j] =triangle[i][j] + Math.min(dp[i-1][j-1],dp[i-1][j] ) 
                }
                
                
                if(i ==(triangle.count()-1))//last row: find min
                {
                    min =Math.min(min,dp[i][j])
                }
            }
        }
        return min
        
        
    }
}





// 2 3 6 4
// 4 5 1
// 7 8
// 3