class Solution {
    fun arrayPairSum(nums: IntArray): Int {
        
        var numsort : IntArray =nums
        numsort.sort()
        var i =0
        var sum =0
        
        while(i+1 <= numsort.count() -1)
        {
            sum =sum + Math.min(numsort[i],numsort[i+1])
            i=i+2
        }
        
        return sum
    }
}