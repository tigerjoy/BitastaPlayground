import java.util.Scanner;
class DisplayAntiSpiral
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
  void displayAntiSpiral(int arr[][])
  {
    int rows=arr.length;
    int cols=arr[0].length;
    int rowStart=0;
    int colStart=0;
    int rowEnd=rows-1;
    int colEnd=cols-1;
    int count=0;
    int size=rows*cols;
    String output="";//Empty string
    while(count!=size)
    {
      // Traverse rightward
      for(int col=colStart;col<=colEnd;col++)
      {
        output=arr[rowStart][col]+output;
        count++;
      }
      // Traverse downward
      for(int row=rowStart+1;row<=rowEnd;row++)
      {
        output=arr[row][colEnd]+output;
        count++;
      }
      // Traverse leftward
      for(int col=colEnd-1;col>=colStart;col--)
      {
        output=arr[rowEnd][col]+output;
        count++;
      }
      // Traverse upward
      for(int row=rowEnd-1;row>=rowStart+1;row--)
      {
        output=arr[row][colStart]+output;
        count++;
      }
      rowStart++;rowEnd--;
      colStart++;colEnd--;
    }
    System.out.println("The elements of the array in anti spiral order are: "+output);
  }
  public static void main(String args[])
  {
    DisplayAntiSpiral obj=new DisplayAntiSpiral();
    System.out.print("Enter number of rows: ");
    int rows=sc.nextInt();
    System.out.print("Enter number of columns: ");
    int cols=sc.nextInt();
    int arr[][]=new int[rows][cols];
    obj.input(arr);
    obj.displayAntiSpiral(arr);
  }//End of main()
}//End of class