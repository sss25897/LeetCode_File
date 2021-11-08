class Solution {
    fun maxProfit(prices: IntArray): Int {
        
        var max =0
        for(i in 1..(prices.count()-1) )
        {
            if( (prices[i] -prices[i-1]) > 0)
            {
                max +=(prices[i] -prices[i-1])
            }
        }
        return max
    }
}