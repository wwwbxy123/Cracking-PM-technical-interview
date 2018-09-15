/*
Write a function to remove the 13th element from a queue (but keep all the other elements in place and in the same order).
jump to question
The approach to this problem depends on what you assume the queue data structure supports.
If we get access to a Node class, then this is fairly easy. We just iterate through the nodes and delete it when we get to the 13th.
However, if it’s a true Queue class, we don’t necessarily have access to the nodes like this. We may only have an add (to the back of the list) and remove (from the front of the list) method.
We could create a second list object, but this isn’t actually necessary. Observe that if we continuously remove elements from the front and add them to the back, we’ll wind up with the exact same list.
To remove the 13th element, we can therefore just remove each element and re-add it—skipping the 13th element.
*/

boolean remove(Queue<Integer> queue, int k){
    if(k < 0 || k >= queue.size){
        return false;
    }
    int size = queue.size();
    for(int i = 0; i < size; i++){
        int head = queue.remove();
        if(i != 13){
            queue.add(head);
        }
    }
    return true;

}