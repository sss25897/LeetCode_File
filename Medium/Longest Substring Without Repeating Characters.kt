class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        
        var max=0
        var left  = 0
        var right = 0
        var hsint: MutableSet<Char>  =mutableSetOf()

        while (right < s.length)
        {
            if( hsint.contains(s[right]))
            {
                while(s[left] != s[right])
                {
                    hsint.remove(s[left])

                    left ++
                }
                left ++
            }
            else
            {
                hsint.add(s[right])

                if(hsint.count() > max)
                {
                    max = hsint.count()
                }
            }           
            
            right ++
        }
        
        return max
    }
}