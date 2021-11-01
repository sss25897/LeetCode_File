
class Solution {
    val hashMap:HashMap<String,Char> = hashMapOf(
        "a" to '2',
        "b" to '2',
        "c" to '2',
        "d" to '3',
        "e" to '3',
        "f" to '3',
        "g" to '4',
        "h" to '4',
        "i" to '4',
        "j" to '5',
        "k" to '5',
        "l" to '5',
        "m" to '6',
        "n" to '6',
        "o" to '6',
        "p" to '7',
        "q" to '7',
        "r" to '7',
        "s" to '7',
        "t" to '8',
        "u" to '8',
        "v" to '8',
        "w" to '9',
        "x" to '9',
        "y" to '9',
        "z" to '9'
    )
    fun letterCombinations(digits: String): List<String> {
        var lsreturn : MutableList<String> = arrayListOf()
        if(digits =="") return lsreturn
        
        
        var cdigits=digits.toCharArray()
        
        var strnow = ""
        var delflag=false
        var for_i =0
              
        for(c in cdigits)
        {
            //first
            if(delflag == false)
            {
              
                for (k in  hashMap.filterValues { it == c }.keys)
                {
                   
                    lsreturn.add(k.toString())
                }
            }
            else
            {
                for_i =lsreturn.count()-1
                //remove old data and create new data
                //ex: a,b,c  -> ad,ae,af,bd,be...
                for(i in 0..for_i)
                {
                    //ex:a
                    strnow=lsreturn[0]
                    for (k in  hashMap.filterValues { it == c }.keys)
                    {
                        //add ad,ae,af...
                        lsreturn.add(strnow +k.toString())
                    }
                    //remove first a,b,c -> b,c
                    lsreturn.removeAt(0)
                }
            }
                     
            if(delflag==false) delflag = true
        }
        return lsreturn.toList()
        
    }
 
}



//note
//best Solution use backtracking 
// http://web.ntnu.edu.tw/~algo/Backtracking.html



