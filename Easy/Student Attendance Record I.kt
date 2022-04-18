class Solution {
    fun checkRecord(s: String): Boolean {
        if("LLL" in s) return false
        
        var chars: CharArray = s.toCharArray()
        var Acount =0
        for( c in chars)
        {
            if(c == 'A')Acount =Acount+1
            if(Acount > 1 ) return false 
        }
        return true
    }
}