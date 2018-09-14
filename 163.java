/*
Given two lists (A and B) of unique strings, write a program to determine if A is a subset of B. That is, check if all the elements from A are contained in B.
*/


public boolean isSubset(String[] bigger, String[] smaller){
    int i = 0;
    int j = 0;
    while(i < smaller.length() && j < bigger.length()){
        if (smller[i] == bigger[j]){
            i ++;
        }
        j++;
    }
    if(i == smaller.length()) return true;
    else
    return false;

}