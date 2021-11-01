class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var lmax =0
        var gmax:Int = (0-Math.pow(2.0,31.0)).toInt()
        var i=0
        for(i in nums )
        {
            if(i > i+lmax)
            {
                lmax=i
            }
            else
            {
                lmax =i+lmax
            }
            if(lmax >gmax)
            {
                gmax =lmax
            }
        }
        return gmax
        
    }
}