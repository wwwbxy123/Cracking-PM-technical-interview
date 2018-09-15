/*
 Write a function to check if two queues are identical (same values in the same order). It’s okay to modify/destroy the two queues.
jump to question
We are allowed to modify the two queues, which should give us a clue that we need to do just that.
We can repeatedly remove the front of each linked list and compare the values. If the values are not equal, then we immediately return false.
What happens when one list is emptied? That depends. If both lists are empty, then we know the linked lists are identical (nothing has failed yet). However, if only one list is empty and the other is not, then we know the lists were of different sizes. After all, we’re removing the elements in the same order.

*/

boolean isEqual(Queue<Integer> one, Queue<Integer> two){
    while(!one.isEmpty() && !two.isEmpty()){
        int oneHead = one.remove();
        int twoHead = two.remove();
        if(oneHead != twoHead){
            return false;
        }
    }

    //two queue have different size
    if(!one.isEmpty() || two.isEmpty()){
        return false;
    }
    return true;
}