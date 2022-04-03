class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        var memo: MutableSet<Int> = hashSetOf()
        
        for( i in nums)
        {
            if(memo.contains(i))
            {
                return true
            }
            memo.add(i)
        }
        return false
        
    }
}