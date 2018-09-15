/*
Write a function which removes all the even numbers from a stack. You should return the original stack, not a new one.
jump to question
For this problem, we can rely on the same instinct as the second approach from the prior problem: reversing something twice puts the elements back in their original order.
We can just pop the stack, element by element. If the element is odd (that is, not even), push it onto a new, temporary stack. Then, once we’re all done, push them back onto their original stack.
*/
void removeEven(Stack<Integer> stack){
    Stack<Integer> temp = new Stack<Integer>();
    while(!stack.isEmpty){
        int x = stack.pop();
        if(x % 2 == 0){
            temp.push(x);
        }

        //return the odds to the stack
        while (!temp.isEmpty){
            stack.push(temp.pop());
        }
    }
}