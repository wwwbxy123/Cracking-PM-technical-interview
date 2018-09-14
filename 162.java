/*
16.2 Reverse the order of elements in an array (without creating a new
array).
jump to question
 At first glance, we might want to just create a second array, iterate over the elements in order, and insert them in reverse order into the new array. Unfortunately, the question says to not create a second array.
Let’s look at any example.
Original: 0, 1, 2, 3, 4, 5, 6 
Reversed: 6, 5, 4, 3, 2, 1, 0
*/

void reverse(int[] array){
    int temp;
    int mid = array.length / 2;
    for (int i = 0; i < mid; i ++){
        int otherside = array.length - i - 1;
        temp = array[otherside];
        array[otherside] = array[i];
        array[i] = temp;
    }
        System.out.println(Arrays.toString(array));
}

/*
import java.util.Arrays;
public class MyClass {
    public static void main(String args[]) {
        int array[] = new int[6];
        array[0] = 1;
        array[1] = 4;
        array[2] = 7;
        array[3] = 8;
        array[4] = 9;
        array[5] = 5;
        reverse(array);
    }
*/