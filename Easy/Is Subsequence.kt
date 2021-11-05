class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var i =0
        
        if(s =="") return true
        
        for ( c in t)
        {
            if(s[i] == c)
            {
                if( i ==(s.count()-1) )
                {
                    return true
                }
                i=i+1
            }
        }
        return false
        
    }
}