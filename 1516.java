/*
You are given an integer array which was sorted, but then rotated. It contains all distinct elements. Find the minimum value. For example, the array might be 6, 8, 9, 11, 15, 20, 3, 4, 5. The minimum value would obviously be 3.
jump to question
A brute force solution would be to just iterate through the array and look for the minimum value. We can guess that this isn’t what the interviewer is looking for though, since it doesn’t use the sorting information.
To come up with a more optimal solution, we probably want to use the information we’re given—the array is “sorted,” but rotated.
 
Since the array is somewhat sorted, let’s think about applying some of the concepts from binary search. Binary search works by looking at the midpoint repeatedly.
In this problem, what does the midpoint tell us? In and of itself, the midpoint being 15 doesn’t tell us anything. However, if we know that the left side is 6 and the right side is 5, we can conclude something. Since left > right, we know that the array is out of order. But since left < middle, we know the left is in order but the right is not.
*/

int findMin(int[] array){
    int left = 0;
    int right = array.length - 1;
    while(array[left] <= array[right]){
        int middle = (left + right) / 2;
        if(array[left] < array[right]){
            left = middle + 1;
        }
        if(array[left] > array[right]){
            right = middle;
        }
    }
    return left;

}



//recursive
int findMin(int[] array, int left, int right){
    int left = 0;
    int right = array.length - 1;
    if(array[left] < array[right]) return left;
    int middle = (left + right) / 2;
    if(array[left] >= array[middle]) return findMin(array, left, middle);
    if(array[left] < array[middle]) return findMin(array, middle + 1, right);
}

