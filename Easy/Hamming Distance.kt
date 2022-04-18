class Solution {
    fun hammingDistance(x: Int, y: Int): Int {
        
        var xor_xy = x xor y
        var hammingDis = 0
        while(xor_xy >0)
        {
            if(xor_xy and  1 == 1)
            {
                hammingDis = hammingDis+1
            }
            xor_xy = xor_xy shr 1
        }
        
        
        return hammingDis
    }
}