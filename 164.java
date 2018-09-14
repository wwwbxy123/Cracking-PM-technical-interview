/*
You are given a two-dimensional array of sales data where the first column is a product ID and the second column is the quantity. Write a function to take this list of
data and return a new two-dimensional array with the total sales for each Example:
Input:
      211,4
      262,3
      211,5
      216,6
Output:
      211,9
      262,3
      216,6
*/

int[][] totalSales(int[][] data){
    //compute total sale of each product
    Hashtable<Integer, Integer> hash = new Hashtable<Integer, Integer>;
    for (int i = 0; i < data.length; i++){
        int ProductID = data[i][0];
        int ProductQuantity = data[i][1];
        if(Hash.containsKey(ProductID)){
            ProductQuantity = ProductQuantity + hash.get(ProductID);
        }
        Hash.put(ProductID,ProductQuantity)
    }

    //convert hashtable to array
    int[][] total = new int[hash.Keyset.size()][2];
    for(int j = 0; j < hash.Keyset.size(); j ++){
        total[j][0] = key;
        total[j][1] = hash.get(Key);
    }
    return total;



}