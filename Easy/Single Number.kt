class Solution {
    fun singleNumber(nums: IntArray): Int {        
        for(i in nums.indices )
        {
           if(nums.filter{ it -> it == nums[i]  }.count() ==1)
                return  nums[i]
                     
        }
        return 0
    }
}