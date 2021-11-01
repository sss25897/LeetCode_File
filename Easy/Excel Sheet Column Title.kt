class Solution {
    fun convertToTitle(columnNumber: Int): String {
        
        var colval =columnNumber
        var strReturn = StringBuilder()
        var quo =0
        var rem =0
        while(colval > 0)
        {

                
                rem =(colval-1)%26
                strReturn.append('A' + rem)
                quo =(colval-1)/26
                colval = quo


        }
        
        return strReturn.toString(). reversed()
        
    }
}