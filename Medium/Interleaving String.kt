class Solution {
    fun isInterleave(s1: String, s2: String, s3: String): Boolean {
        var i =0
        var j =0
        var x =0
        var memo: MutableSet<Int> = mutableSetOf()
        return  ReInterleave(s1,s2,s3,i,j,x,memo)
       
        
    }
    
    fun ReInterleave(s1: String, s2: String, s3: String,i: Int, j: Int,x: Int,memo:MutableSet<Int> ) : Boolean
    {
        var bl = false
        var key = i * s3.count() + j

        
        
        if(i ==s1.count() && j ==s2.count() && x ==s3.count() )
        {
            return true
        }
        
        if(memo.contains(key))
        {
            return false
        }
        
        if(i < s1.count() && bl==false && x<s3.count())
        {
            if(s1[i] ==s3[x])
            {
                 bl=ReInterleave(s1,s2,s3,i+1,j,x+1,memo)  
            }  
        }
        
         if(bl==false && j <s2.count() && x<s3.count())
        {
        
            if(s2[j] == s3[x])
            {
                bl=ReInterleave(s1,s2,s3,i,j+1,x+1,memo)    
            }
        }
        
        memo.add(key)
        return bl
    }
}