/*
Implement binary search. That is, given a sorted array of integers and a value, find the location of that value.
jump to question
Binary search works by repeatedly “halving” the array into subarrays. In the first iteration, we compare the value x to the midpoint and learn whether x will be in the left half or the right half. Then, we repeat this step with this new subarray: is x found on the left half of it (the new subarray) or the right?
We can implement this either recursively or iteratively (non-recursively). We’ll start with the recursive solution since it’s more intuitive for most people.
*/

int search(int[] array, int x){
    int left = 0;
    int right = array.length - 1;
    while( left < right){
        int middle = (left + right) / 2;
        if(x == middle){
            return middle;
        }

        if(x < middle){
            right = middle - 1;
        }
        else{
            left = middle + 1;
        }
    }
    return -1;

}


//recursive
int search(int[] array, int x, int left, int right){
    if(right < left) return -1;
    int middle = (left + right) / 2;
    if( x = middle) return middle;
    if( x < middle) return search(array, left, middle - 1);
    if( x > middle) return search(array, middle + 1, right);
}