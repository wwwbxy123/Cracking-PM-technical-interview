/*
Given two sorted arrays, write a function to merge them in sorted order into a new array.
jump to question
The most efficient way to tackle this is to use the fact that the arrays are sorted. We can merge them
 
by taking successive elements repeatedly until we reach the end of both arrays. We maintain pointers to where we are in each array so that we can just easily move onto the next array.
*/

int mergeIntoNew(int[] a, int[] b){
    int length = a.length + b.length;
    int[] merged = new int[length];
    int i = 0;
    int j = 0;
    int index = 0;

    while(i < a.length && j < b.length){
        if(a[i] <= b[j]){
            merged[index] = a[i];
            i++;
            index++;
        }
        else{
            merged[index] = b[j];
            j++;
            index++;
        }
    }
    while(i < a.length){
        merged[index] = a[i];
        i++;
        index ++;
    }
    while(j < b.length){
        merged[index] = b[j];
        j++;
        index ++;
    }
        return merged;
    }
