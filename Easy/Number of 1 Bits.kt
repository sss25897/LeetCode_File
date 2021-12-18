class Solution {
    // you need treat n as an unsigned value
    fun hammingWeight(n:Int):Int {
        var temp_n =n
        var ans =0
        for( i in 0..31)
        {
            if(temp_n and 1 ==1)
            {
                ans +=1
            }
            temp_n= temp_n shr 1
        }
        return ans
 
    }
}