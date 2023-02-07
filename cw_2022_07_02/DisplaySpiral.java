import java.util.Scanner;
class DisplaySpiral
{
  static Scanner sc=new Scanner(System.in);
  void input(int arr[][])
  {
    int rows=arr.length;
    int cols=arr[0].length;
    for(int i=0;i<=rows-1;i++)
    {
      for(int j=0;j<=cols-1;j++)
      {
        System.out.printf("Enter element %d,%d: ",i+1,j+1);
        arr[i][j]=sc.nextInt();
      }
    }
  }
  void displaySpiral(int arr[][])
  {
    int rows=arr.length;
    int cols=arr[0].length;
    int rowStart=0;
    int rowEnd=rows-1;
    int colStart=0;
    int colEnd=cols-1;
    int count=0;
    int size=rows*cols;
    while(count!=size)
    {
      //Traverse rightwards
      for(int col=colStart;col<=colEnd;col++)
      {
        System.out.print(arr[rowStart][col]);
        count++;
      }
      //Traverse downwards
      for(int row=rowStart+1;row<=rowEnd;row++)
      {
        System.out.print(arr[row][colEnd]);
        count++;
      }
      //Traverse leftwards
      for(int col=colEnd-1;col>=colStart;col--)
      {
        System.out.print(arr[rowEnd][col]);
        count++;
      }
      //Traverse upwards
      for(int row=rowEnd-1;row>=rowStart+1;row--)
      {
        System.out.print(arr[row][colStart]);
        count++;
      }
      rowStart++;rowEnd--;
      colStart++;colEnd--;
    }
    System.out.println();
  }
  public static void main(String args[])
  {
    DisplaySpiral obj=new DisplaySpiral();
    System.out.print("Enter number of rows: ");
    int rows=sc.nextInt();
    System.out.print("Enter number of columns: ");
    int cols=sc.nextInt();
    int arr[][]=new int[rows][cols];
    obj.input(arr);
    System.out.println("The elements of the array in spiral order are:");
    obj.displaySpiral(arr);
  }//End of main()
}//End of class