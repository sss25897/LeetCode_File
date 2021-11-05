class Solution {
    fun arrangeCoins(n: Int): Int {
        var i =1
        var temp_n =n
        while(temp_n > 0)
        {
            temp_n= temp_n-i            
            i++
        }
        
        if(temp_n == 0) return i-1
        if(temp_n < 0) return i-2
        
        return 0
        
    }
}