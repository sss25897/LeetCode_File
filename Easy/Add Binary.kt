class Solution {
    fun addBinary(a: String, b: String): String {
        var ca =a.toCharArray()
        var cb= b.toCharArray()
        var sum=0
        var cflag=0
        var sreturn =""
        var i=ca.count()-1
        var j=cb.count()-1

        
        while( i>=0 || j>=0)
        {
            sum=0
            if(i>=0)sum += ca[i]-'0'            
            if(j>=0)sum += cb[j]-'0'       
            if(cflag ==1) sum +=1
            cflag =sum/2
            sreturn = (sum%2).toString()  + sreturn
            i--
            j--
        }
        if(cflag ==1)
        {
            sreturn ="1" + sreturn
        }
        return sreturn
        
    }
}