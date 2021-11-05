class Solution {
    fun countBits(n: Int): IntArray {
        
        var dp : MutableList<Int> = arrayListOf(0,1,1,2)
        var dp_n4 : MutableList<Int> = ArrayList()
        var total_num = 3
        var temp = 4
        var count =0
        
        // if n <4, return dp
        if(n < 4)
        {
            for(i in 0 ..n)
            {
                dp_n4.add(dp[i])
            }
            
            return dp_n4.toIntArray()
        }
        

        while(true)
        {
            total_num++ //count number
            dp.add(dp[count]+1) // add number
            
            count +=1           //add count
            if(count == temp)
            {
                temp =temp*2  // temp range add,
                count= 0      //count init
            }
            
            if(total_num == n) break
        }
        
        return dp.toIntArray()
        
        
    }
}






// [0,1,1,2] 03
// [1,2,2,3] 47
// [1,2,2,3, 2,3,3,4] 8 15
// [1,2,2,3, 2,3,3,4, 2,3,3,4 ,3,4,4,5] 16 31

//best solution
// class Solution {
//     fun countBits(n: Int): IntArray {
//         val ret = IntArray(n+1) {0}
//         for (i in 1..n) {
//             ret[i] = ret[i-1 and i] + 1
//         }
//         return ret
//     }
// }