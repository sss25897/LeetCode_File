class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        
        var i =0
        var j = nums.count()-1
        var mid =0
        
        while(i<=j)
        {
            mid =(i + j)/2
            if(nums[mid] == target)
            {
                return mid
            }
            
            if(nums[mid]> target)
            {
                j=mid-1
                continue
            }
            if(nums[mid]<target)
            {

                i=mid+1
                continue
            }
    
            
        }
        
        if(nums[mid] < target) return mid+1
        if(nums[mid] > target) return mid
        
        return mid
        
    }
}