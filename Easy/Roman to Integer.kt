class Solution {
    private var index=0
    fun romanToInt(s: String): Int {
        var sum =0
        var cs =s.toCharArray()
        
        index=cs.count()-1
        for(i in (cs.count()-1) downTo 0 )
        {
            when(cs[i])
            {
                'I' -> sum += Process_I(cs)
                'V' -> sum += 5
                'X' -> sum += Process_X(cs)
                'L' -> sum += 50
                'C' -> sum += Process_C(cs)
                'D' -> sum += 500
                'M' -> sum += 1000
            }
            index -=1
        }
        return sum
        
        
    }
    
     
    
    fun Process_I(c:CharArray) : Int
    {
        if(index ==c.count()-1) return 1
        
        if(c[index+1] == 'V' || c[index+1] =='X')
        {
            return -1
        }
        else
        {
            return 1
        }
    }
    
     fun Process_X(c:CharArray) : Int
    {
        if(index ==c.count()-1) return 10
        if(c[index+1] == 'L' || c[index+1] =='C')
        {
            return -10
        }
        else
        {
            return 10
        }
    }
    
    
     fun Process_C(c:CharArray) : Int
    {
        if(index ==c.count()-1) return 100
        if(c[index+1] == 'D' || c[index+1] =='M')
        {
            return -100
        }
        else
        {
            return 100
        }
    }     
}