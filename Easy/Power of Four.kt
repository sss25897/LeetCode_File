class Solution {
    fun isPowerOfFour(n: Int): Boolean {
        var number1bit : Int =0
        var number0bit : Int =0
        var shn = n
        while(shn >0)
        {
            if( (shn.and(1) ) ==1)
            {
                number1bit =number1bit+1
            }
            else
            {
                number0bit = number0bit+1
            }    
            shn =shn shr 1
            
          
        }
        
        return (number1bit==1) && (number0bit%2 ==0)
        
        
    }
}



// 1
// 100
// 10000
// 1000000