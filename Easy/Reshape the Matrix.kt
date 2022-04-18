class Solution {
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        
        if(mat.count() * mat[0].count() != r*c) return mat
        
        var listr : MutableList<IntArray> =ArrayList()
        var listc : MutableList<Int> = ArrayList()
        var ic=0
        for(mati in mat)
        {
            for(mati_item in mati)
            {                
                listc.add(mati_item)
                ic +=1
                if(ic == c)
                {
                    listr.add(listc.toIntArray())
                    listc.clear()
                    ic=0
                }
                
            }
        }
              
        
        return listr.toTypedArray()
        
    }
}