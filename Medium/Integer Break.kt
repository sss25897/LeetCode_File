class Solution {
    fun integerBreak(n: Int): Int {
        var number3 =0
        var mod3 =0
        var final =0
        var max = 1
        
        if(n < 4) return n-1
        if(n == 4) return n
        
        number3 = n/3
        mod3 = n%3
        if(mod3 ==1)
        {
            number3 -=1
            final =4
        }
        else
        {            
            final = mod3
        }
        
        for(i in 1 ..number3)
        {
            max = max*3
        }
        
        if(final != 0)
        {
          max = max * final  
        }
        
        
        
        
        
        
        return max
    }
}


// 2
// 1 1

// 3
// 2 1

// 4
// 2 2

// 5
// 3 2

// 6
// 3 3

// 7
// 3 4

// 8
// 3 3 2

// 9
// 3 3 3

// 10
// 3 3 4

// 11
// 3 3 3 2

//12
// 3 3 3 3