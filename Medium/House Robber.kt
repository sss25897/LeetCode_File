class Solution {
    fun rob(nums: IntArray): Int {
        var dp : Array<Int> = Array(nums.count() + 2) {0}
        var max = nums[0]
        dp[2] =nums[0]
        for(i in 3..(nums.count()+1) )
        {
            dp[i] =Math.max(dp[i-2],dp[i-3]) + nums[i-2]
            max =Math.max(dp[i],max)
        }
        
        return max
    }
}



// dp[i] = dp[i-2] or dp[i-3] max plus nums[i]
// 5,2,1,1,5,6
// 0,0,5,2,6,6,11,12

// 2,5,1,1,5,6
// 2,5,3,6,10,12

//[2,7,9,3,1]
//2,7,11,10,12
//-> 0,0,2,7,11,10,12
