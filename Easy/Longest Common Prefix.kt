class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.count() <1) return ""
        if (strs.count() > 200) return ""
        
        var firststring =strs[0].toCharArray()
        var prefix =""

        
        for (i in firststring)
        {
            prefix += i
            for( j in strs)
            {
                if(j.indexOf(prefix) != 0)
                {
                    prefix =prefix.substring(0,prefix.count()-1)
                    break
                }             
            }
            if(prefix=="") break
            
        }
        return prefix
        
    }
}