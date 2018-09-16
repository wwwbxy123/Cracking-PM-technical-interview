static boolean binarySearch(int v, int[] lst, int low, int high) {
    if (low >= high) return false;
    int mid = (high + low) / 2;
        if(lst[i] == mid) return true;
        if(lst[i] < mid) return binarySearch(v, lst, low, mid - 1);
        if(lst[i] > mid) return binarySearch(v, lst, mid + 1, high); 
    
}