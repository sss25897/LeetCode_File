class Solution {
    fun maxProfit(prices: IntArray): Int {
        if(prices.count() == 1) return 0
        
        var buy = Int.MIN_VALUE
        var pre_buy =0
        var sell =0
        var pre_sell =0
        
        for(price in prices)
        {
            pre_buy = buy
            buy = Math.max(pre_sell - price, pre_buy)
            pre_sell = sell
            sell = Math.max(pre_buy + price, pre_sell)
        }
        
        
        return sell
    }
}


// buy[i]  = max(rest[i-1] - price, buy[i-1]) 
// sell[i] = max(buy[i-1] + price, sell[i-1])
// rest[i] = max(sell[i-1], buy[i-1], rest[i-1])

// rest[i] =  sell[i-1]
// -> buy[i]  = max(sell[i-2] - price, buy[i-1]) 
//    sell[i] = max(buy[i-1] + price, sell[i-1])
