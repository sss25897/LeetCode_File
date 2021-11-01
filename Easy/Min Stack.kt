class MinStack() {

    //use two MutableList simulate Stack
    //mystack: stack of element
    //minstack stack of minvalue
    var mystack : MutableList<Int>  = ArrayList()
    var minstack : MutableList<Int>  = ArrayList()

    fun push(`val`: Int) {
        mystack.add(`val`)
        
        if(minstack.count() ==0)
        {
           minstack.add(`val`) 
        }
        else
        {
            //check if value <= minstack's top, add value
            if(minstack[minstack.count()-1] >= `val`)
            {
                 minstack.add(`val`) 
            }
        }
        
    }

    fun pop() {
        
      
        if(mystack[mystack.count()-1] == minstack[minstack.count()-1])
        {
            minstack.removeAt(minstack.count()-1)
        }
        mystack.removeAt(mystack.count()-1)
    }

    fun top(): Int {
        
        if(minstack.count()>0)
        {
            return mystack[mystack.count()-1]
        }
        return 0
    }

    fun getMin(): Int {
        
         if(minstack.count()>0)
        {
            return minstack[minstack.count()-1]
        }
        return 0
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */