class Solution {
    fun generateParenthesis(n: Int): List<String> {
        
        var left = n
        var right = 0
        var s : String =""
        var ls_s : MutableList<String> = ArrayList()
        
        backtrack(s,left,right,ls_s)
        
        return ls_s.toList()
    }
    
    fun backtrack(s: String ,left: Int, right: Int,ls_s: MutableList<String>) 
    {
        
        if(left==0 && right ==0)
        {
            ls_s.add(s)
        }
        if(left > 0)
        {
            backtrack(s+"(" ,left-1,right+1,ls_s)
        }
        if(right >0)
        {
            backtrack(s+ ")" ,left,right-1,ls_s)
        }      

    }
}





