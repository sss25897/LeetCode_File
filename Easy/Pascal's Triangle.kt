class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        var lsprev : MutableList<Int> =arrayListOf(1,1)
        var lsreturn : MutableList<List<Int>> = ArrayList()
        var pointer =0

        lsreturn.add( arrayListOf(1))
        if(numRows ==1) return lsreturn
        lsreturn.add(lsprev)
        if(numRows ==2) return lsreturn
             

        for(i in 3..numRows)
        {
            var ls_temp : MutableList<Int> =ArrayList()
            pointer = 1
            ls_temp.add(1)
            
            while(pointer < (lsprev.count() ))
            {
      
                ls_temp.add(lsprev[pointer-1]+lsprev[pointer])               
                pointer ++
            }
            ls_temp.add(1)
            lsreturn.add(ls_temp.toList())
            lsprev =ls_temp
            
        }
        return lsreturn.toList()
        
        
        
    }
}