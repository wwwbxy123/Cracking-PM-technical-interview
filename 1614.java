/*
Implement insertion sort.
Insertion sort operates by iterating through the array, inserting each element in order on the element’s
left side.
We can most cleanly implement this as two different functions.
The first function performs the overall algorithm: pick up an element, insert it in order, pick up the next one, and so on.
*/

void insertionSort(int[] array){
    for(int i = 1; i < array.length; i++){
        insertInOrder(array,i);
    }
}

void  insertInOrder(int[] array, int index){
    for(int i = array.length - 2; i >= 0; i--){
        if (index > array[i]){
            array[i + 1] = index;
            break;
        }
        else{
            array[i + 1] = array[i];
        }
    }
}