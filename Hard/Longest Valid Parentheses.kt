class Solution {
    fun longestValidParentheses(s: String): Int {
        var dp : MutableList<Int> = MutableList(s.count()){0}
        var max =0
        for(i in 1..(s.count()-1))
        {
            if(s[i] =='(')
            {
                dp[i] = 0
            }
            else
            {
               if(s[i-1] =='(')
               {
                   if(i-2 <0)
                   {
                     dp[i] = 2   
                   }
                   else
                   {
                     dp[i] = dp[i-2] + 2   
                   }
                      
                    max=Math.max(max,dp[i])
                    continue
               }

               if(i -dp[i-1] -1 < 0) continue
                
                 if(s[i -dp[i-1] -1] =='(')  //5-4-1 =0
                 {
                   if(i-dp[i-1]-2 < 0) //4+2 + dp[-1](before)
                   {
                       dp[i] = dp[i-1] + 2
                   }
                   else
                   {
                       dp[i] = dp[i-1] + 2 + dp[i-dp[i-1]-2] 
                   }
                    
                    max=Math.max(max,dp[i])
                 }
              
            }          
            
        }
        
        return max
    }
}


//"(()())"
//00204