class Solution {
    fun numberOfArithmeticSlices(nums: IntArray): Int {
      var dp:MutableList<Int> = MutableList(nums.count()){0}
      var ans = 0
      if(nums.count()<3) return 0
     
      for(i in 2..nums.count()-1)
        {
            if((nums[i] - nums[i-1]) == (nums[i-1] - nums[i-2]) )
            {
                dp[i] =dp[i-1]+1
                ans +=dp[i]
            }
            
        }
        return ans
    }
}