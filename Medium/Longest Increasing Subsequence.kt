class Solution {
    fun lengthOfLIS(nums: IntArray): Int {
        var dp :IntArray = IntArray(nums.count()){1}
        var max =0
        var max_all =0

        for( i in 0..(nums.count()-1) )
        {
            max=0
            for(j in 0..i)
            {
                if(nums[i] > nums[j])
                {
                   max = Math.max(max,dp[j]) 
                }
            }
            dp[i] =max+1            
            max_all=Math.max(dp[i],max_all)          
        }
        
        return max_all
    }
}



// [10,9,2,5,3,7,101,18]
//  1, 1, 1,2,2,3,4,4

// 10 9 2 3 5 4 101 18
//  1 1 1 2 3 3