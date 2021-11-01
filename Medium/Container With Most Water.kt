class Solution {
    fun maxArea(height: IntArray): Int {
        if(height.count() ==0) return 0
        var first=0
        var second =height.count()-1
        var _height =0
        var maxarea =0
        var now_value=0
        while(first <second)
        {

            if(height[first]<=height[second])
            {
                _height = height[first]
            }
            else
            {
                _height = height[second]
            }
            
            if(_height *(second-first) >maxarea)
            {
                maxarea=_height *(second-first)
            }
            
            
            if(height[first]<=height[second])
            {
                now_value=height[first]
                 first++
                while(height[first]<now_value)
                {
                    first++                                                      
                }
            }
            else
            {
                now_value=height[second]
                 second--
                while(height[second] < now_value)
                {                   
                         second--
                }
            }
        }
        
        
        return maxarea
    }
}