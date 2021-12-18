class Solution {
    fun missingNumber(nums: IntArray): Int {
        var sum =0
        
        for(i in 0..nums.count()-1)
        {
            sum += (i+1) - nums[i]
        }
        return sum
        
        
    }
}