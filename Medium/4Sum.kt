class Solution {
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        
        var lsreturn : MutableList<MutableList<Int>> = ArrayList()
        if(nums.count() < 4) return lsreturn       
        
        nums.sort()
        var left = 0
        var right = 0
        var finalindex = nums.count() -1
        var lsrecord :MutableList<Int> = ArrayList()
        var nowsum =0
        for(i in 0..finalindex )
        {
            for(j in (i+1)..finalindex )
            {
                left = j+1
                right =finalindex
                while(left < right)
                {
                    nowsum =nums[i] + nums[j] + nums[left] + nums[right]
                    if( nowsum == target )
                    {
                        lsrecord=mutableListOf(nums[i],nums[j],nums[left],nums[right])
                        if(!lsreturn.contains(lsrecord))
                        {
                           lsreturn.add(lsrecord)
                        }
                        
                        left++
                        right--
                    }
                    else if( nowsum < target)
                    {
                        left++
                    }
                    else if( nowsum > target)
                    {
                        right--
                    }
                }
            }
        }
        
        return lsreturn
    }
}