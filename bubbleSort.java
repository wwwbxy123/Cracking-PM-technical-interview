static void bubbleSort(int[] lst) {
    for(int i = 0; i < lst.length - 1; i++){
        for(int j = 0; j < lst.length - 1 - i; j ++){
            if(lst[j] > lst[j + 1]){
                int temp = lst[j+1];
                lst[j+1] = lst[j];
                lst[j] = temp; 
            }
        }
        
    }
}