class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var i : Int =0
        var j : Int =0
        var temp: Int =0
        while(j < nums.count())
        {
            if(nums[j] ==0)
            {
                j=j+1
            }
            else
            {
                temp=nums[j]
                nums[j]= nums[i]
                nums[i] = temp
                i=i+1
                j=j+1
            }
        }

        
        
    }
}