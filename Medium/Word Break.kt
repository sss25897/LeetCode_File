//BFS & Memo set
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



//=======================================================

//Solution by Dynamic Programming



class Solution {
    fun wordBreak(s: String, wordDict: List<String>): Boolean {
     var len = s.count()+1 
     var dp  = Array<Boolean>(len){false}
     
     dp[0] =true
    for(i in 0..(s.count()-1) )
    {
        if(dp[i] == false) continue
        
        var s_temp =s.drop(i)
        for(wd in wordDict)
        {
            if(s_temp.count() >= wd.count())
            {
              if(s_temp.substring(0,wd.count()) == wd)
              {
                dp[i + wd.count()] =true
              }  
            }
            
        }
    }
         

     
     return dp[len-1]
    }
}