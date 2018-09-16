static void selectionSort(int[] lst){
    for(int i = 0; i < lst.length; i++){
        for(int j = i; j < lst.length; j++){
            if(lst[j] < lst[i]){
                int temp = lst[i];
                lst[i] = lst[j];
                lst[j] = temp;
            }
        }
    }
}