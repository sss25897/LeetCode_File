class Solution {
    fun reverse(x: Int): Int {
       var strReturn =""
        var strReverse : CharArray =charArrayOf()
        var lastindex =0
        
        if(x > Math.pow(2.0,31.0) || x < (0 - Math.pow(2.0,31.0)) ) return 0
        if(x==0) return 0
        
        
        strReverse=x.toString().toCharArray()
        
        if(strReverse[0] =='-')
        {
            strReturn += '-'
            lastindex=1
        }
        
        for (i in strReverse.count()-1 downTo lastindex)
        {
            
            strReturn +=strReverse[i]
        }
        
        try
        {
             return strReturn.toInt()
        }
        catch(e: NumberFormatException)
        {
            return 0
        }
       
    }
}