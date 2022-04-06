class MyQueue() {

    var stack1  = ArrayDeque<Int>() 
    var stack_first  = ArrayDeque<Int>()
    
    fun push(x: Int) {
        stack1.addFirst(x)
    }

    fun pop(): Int {
        toFirst()
        var ireturn = stack_first.first()
        stack_first.pop()
        return ireturn;
    }

    fun peek(): Int {
        toFirst()
        return stack_first.first()
    }

    fun empty(): Boolean {
        return stack_first.isEmpty() && stack1.isEmpty()
    }
    
    fun toFirst()
    {    
        if (!stack_first.isEmpty()) return;
        while(!stack1.isEmpty())
        {
            stack_first.addFirst(stack1.first())
            stack1.removeFirst()
        }
    }    
    
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * var obj = MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */