boolean ArrayIsSame(int[]array1, int[]array2){
    if(array1.length != array2.length) return false;
    HashMap<Integer, Interger> map= new HashMap<>();
    for(int i = 0; i < array1.length; i ++){
        Hash.put(array1[i],i);
    }
    for(int j = 0; j < array2.length; j++){
        Hash.put(array1[j],j);
    }
    
}