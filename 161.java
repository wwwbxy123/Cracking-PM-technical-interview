/*
Given a sorted array of positive integers with an empty spot (zero) at the end, insert an element in sorted order.
jump to question
We can imagine that our array looks something like this (with a blank spot at the end):
14789_
*/
public static int[] insert(int[] array, int x){
    for(int i = array.length - 2 ; i >= 0; i--){
        if(x < array[i]) {
            array[i + 1] = array[i];
        }
        
        else if( x >= array[i]){
            array[i + 1] = x;
            break;
        }
     }
    return array;
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
        int n = 5;
        int[] m = insert(array, n);
        System.out.println(Arrays.toString(m));
    }
*/