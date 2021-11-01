class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
       var hashmap:HashMap<Int,Int> = HashMap<Int,Int>()
        var output: IntArray = intArrayOf(-1)

        for(i in nums.indices)
        {
             hashmap.put(i,nums[i])
           if(hashmap.containsValue(target - nums[i])) 
           {
                output = hashmap.filterValues { it == (target-nums[i]) || it == nums[i] }.keys.toIntArray()
                if(output.count() ==2 )break
                
            }
        }
        
             return output     
    
    }
}