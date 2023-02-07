class ForEachExample{
  public static void main(String[]args){
    // Example #1
    // int arr[] = {1 ,2 ,3 ,4, 5};
    // for(int item: arr){
    //   System.out.print(item + ", ");
    // }
    // System.out.println();
    

    // Example #2
    // int mat[][] = {
    //   {1, 2, 3},
    //   {4, 5, 6},
    //   {7, 8, 9},
    // };
    // for(int[] row: mat) {
    //   for(int col: row) {
    //     System.out.print(col + "\t");
    //   }
    //   System.out.println();
    // }
    

    // Limitations 
    // #1
    int arr[] = {1, 2, 3, 4, 5};
    System.out.println("Before");
    for(int item: arr){
      System.out.print(item + ",");
    }
    System.out.println();
    
    // Write code to change the array
    int index = 0;
    for(int item: arr){
      arr[index] = item * 2;
      index++;
    }
    
    System.out.println("After");
    for(int item: arr){
      System.out.print(item + ",");
    }
    System.out.println();
  }
}