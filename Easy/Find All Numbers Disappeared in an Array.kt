class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        var lsReturn : MutableList<Int> = ArrayList()
        
        for(i in 1..nums.count())
        {
            if(!nums.contains(i))
            {
              lsReturn.add(i)  
            }
        }
        
        return lsReturn
    }
}