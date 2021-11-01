class Solution {
    fun isPalindrome(x: Int): Boolean {
        
       
        if (x<0) return false
        if(x < (0-Math.pow(2.0,31.0)) || x > Math.pow(2.0,31.0)) return false
            
        var archarX =x.toString().toCharArray()
        var i =0
        var j = archarX.count() -1
        
        while(i < j)
        {
            if(archarX[i] != archarX[j])
            {
                return false
            }
            i=i+1
            j=j-1
        }
        
        return true
    }
}