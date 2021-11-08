//BFS & set
//but timeout when  large number of wordDict 

class Solution {
    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        var memo : MutableSet<String> = mutableSetOf()
       
        return Recursive(s,wordDict,memo)
    }
    fun Recursive(s: String, wordDict: List<String>,memo : MutableSet<String>) : Boolean
    {
        //check compelete
        var check = 0
        println(s)
        for(i in 0..(s.count()-1) )
        {
            if(s[i] != '*') break
            check++
        }
        if(check == s.count()) return true
        
        //check memo
        if(memo.contains(s)) return false
        
        //BFS
        var bl =false
        for(i in 0..(wordDict.count()-1) )
        {
            if(s.contains(wordDict[i]))
            {
              bl =Recursive(s.replaceFirst(wordDict[i],"*"),wordDict,memo) 
              if(bl == true) return true
            }
            
        }
        
        
        
        memo.add(s)
        return false
    }
}

