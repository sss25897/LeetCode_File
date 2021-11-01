class Solution {
    fun lengthOfLastWord(s: String): Int {
        var cs = s.toCharArray()
        var flag=0
        var length_lastword =0
        if(cs.count()<1 || cs.count()>10000) return length_lastword
        for ( i in (cs.count()-1) downTo 0)
        {
            if(cs[i] !=' ')
            {
                length_lastword+=1
                if(flag==0)
                {
                    
                    flag=1
                }
            }
            else
            {
                if(flag == 1)
                {
                    flag=2
                }
            }
            if(flag ==2) return length_lastword

      
        }
        return length_lastword
    }
}