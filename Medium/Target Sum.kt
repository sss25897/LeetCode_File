
//Use TreeTraversal with memo


class Solution {
    fun findTargetSumWays(nums: IntArray, target: Int): Int {
        var dict : MutableMap<Pair<Int, Int>, Int> = mutableMapOf()
        
        return TreeTraversal(0,nums,-1,target,dict)
    }
    
    fun TreeTraversal(v : Int, nums: IntArray,i : Int, target: Int, dict : MutableMap<Pair<Int, Int>, Int> ) : Int
    {
        var sreturn =0
        if(i == nums.count()-1)
        {
            if(v == target)
            {
                return 1
            }
            else
            {
                return 0
            }
        }
         
        if(dict.containsKey(Pair(i,v)))
        {
            return  dict[Pair(i,v)]!!
        }
        sreturn +=TreeTraversal(v + nums[i+1],nums,i+1,target,dict)      
        sreturn +=TreeTraversal(v - nums[i+1],nums,i+1,target,dict)
        
        dict.put(Pair(i,v),sreturn)

        
        return sreturn
    }
}