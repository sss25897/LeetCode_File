class Solution {
    fun isValid(s: String): Boolean {
        
        var cs =s.toCharArray()
        var stack_f=ArrayDeque<Char>()
        
        var i=0
        var j=cs.count() -1
        if(j%2 ==0) return false
        
        for(i in 0..(cs.count()-1))
        {
           when(cs[i])
            {
                '(' -> stack_f.push('(')
                '{' -> stack_f.push('{')
                '[' -> stack_f.push('[')
                ')' -> {
                        if(stack_f.count()==0) return false
                        if(stack_f.peek() =='(')
                        {
                            stack_f.pop()
                        }
                         else return false
                    }   
                  '}' -> {
                        if(stack_f.count()==0) return false
                        if(stack_f.peek() =='{')
                        {
                            stack_f.pop()
                        }
                        else return false
                      
                    }  
                    ']' -> {
                        if(stack_f.count()==0) return false
                        if(stack_f.peek() =='[')
                        {
                            stack_f.pop()
                        }
                         else return false
                    }  
            }
            

            
        }
        
       if(stack_f.count()>0) return false
        
        return true
        
    }
}