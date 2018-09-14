/*
Given a sorted array of positive integers with an empty spot (zero) at the end, insert an element in sorted order.
jump to question
We can imagine that our array looks something like this (with a blank spot at the end):
14789_
*/
boolean insert(int[] array, int x){
    for(int i = array.length - 2 ; i >= 0; i--){
        if(x >= array[i])) {
            array[i + 1] = x;
            return true;
            break;
        }
        else{
            array[i + 1] = array[i];
        }
        return false;
    }
}