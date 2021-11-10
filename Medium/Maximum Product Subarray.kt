class Solution {
    fun maxProduct(nums: IntArray): Int {
        var dp : Array<Int?> = Array<Int?>(nums.count()){null}
        var dp_min: Array<Int?> = Array<Int?>(nums.count()){null} //min
        var max = nums[0]
        dp[0]= nums[0]
        dp_min[0] = nums[0]
        
        for(i in 1..(nums.count()-1) )
        {
           dp_min[i] =Math.min( Math.min(dp[i-1]!! * nums[i],dp_min[i-1]!! *nums[i]) , nums[i] )
           dp[i] =Math.max( Math.max(dp[i-1]!! * nums[i],dp_min[i-1]!! *nums[i]) , nums[i] )
           max =Math.max(max,dp[i]!!)
        }
       
        return max
    }
}








