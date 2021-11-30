class Solution {
    fun diffWaysToCompute(expression: String): List<Int> {
        
        var ans : MutableList<Int> = ArrayList()
        
        for(i in 0..(expression.count()-1) )
        {
            if(expression[i]=='-' || expression[i]=='+' || expression[i]=='*')
            {
              var left : MutableList<Int> = diffWaysToCompute(expression.substring(0,i)).toMutableList()
              var right : MutableList<Int> =diffWaysToCompute(expression.substring(i+1)).toMutableList()
              
              for(j in 0..(left.count()-1) )
              {
                for(k in 0..(right.count()-1) )
                {
                    when(expression[i])
                    {
                        '-' -> ans.add(left[j] - right[k])
                        '+' -> ans.add(left[j] + right[k])
                        '*' -> ans.add(left[j] * right[k])
                    }
                }
              }
            }
           
        }
        if(ans.count() ==0)  ans.add(expression.toInt())
        
        return ans.toList()
        
        
    }
}