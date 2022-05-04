class Solution {
    fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean {
        
        var m =0
        var n =1
        
        for (m in matrix.indices)
        {       
            if(m ==0)continue
            for (n in matrix[m].indices) 
            {
                if(n==0) continue
                
                if(matrix[m][n] != matrix[m-1][n-1]) return false
            }
        }
        return true
        
    }
}