/*
Write a function which takes a stack as input and returns a new stack which has the elements reversed.
jump to question
The most straightforward way to do this is to just create a new stack and pop the elements from the first stack onto the second. This will put the top element from the original stack on the bottom of the new stack.
*/

Stack<Integer> reverese(Stack<Integer> stack){
    Stack<Integer> reversed = new Stack<Integer>();
    while(!stack.isEmpty()){
        reversed.push(stack.pop());
    }
    return reversed;
}

/*
method2:The only problem with this is that our original stack gets completely emptied in the process. If this is a problem (ask your interviewer!), then you can use an additional stack to hold all the popped values.
We push the popped values onto both the temp stack and the reversed stack. (These stacks will have the same elements in the same—reversed—order.) Once we’re done popping the elements from stack, we push them back from temp onto stack. 
*/
void Stack<Integer> reverseWithoutDestory(Stack<Integer> stack){
    Stack<Integer> reversed = new Stack<Integer>();
    Stack<Integer> temp = new Stack<Intege>();
    
    while(!stack.isEmpty()){
        int x = stack.pop();
        reversed.push(x);
        temp.push(x);
    }
    while(!temp.isEmpty()){
        stack.push(temp.pop());
    }
    return reversed;
}