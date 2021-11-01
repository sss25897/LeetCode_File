//Two-Pointer question
class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.count()-1
        var lsreturn =IntArray(2)
        while(left < right)
        {
            if((numbers[left] + numbers[right]) == target )
            {
                lsreturn[0] = left+1
                lsreturn[1] = right+1
                left = right
            }
            else if((numbers[left] + numbers[right]) < target)
            {
                left++
            }
            else if((numbers[left] + numbers[right]) > target)
            {
                right--
            }
            
        }
        return lsreturn
    }
}