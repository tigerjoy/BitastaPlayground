import java.util.Scanner;
class GenerateSpiral
{
  static Scanner sc=new Scanner(System.in);
  void display(int arr[][])
  {
    int rows=arr.length;
    int cols=arr[0].length;
    for(int i=0;i<=rows-1;i++)
    {
      for(int j=0;j<=cols-1;j++)
      {
        System.out.print(arr[i][j]+"\t"); 
      }
      System.out.println();
    }
  }
  void generateSpiral(int arr[][])
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
        count++;
        arr[rowStart][col]=count;
      }
      //Traverse downwards
      for(int row=rowStart+1;row<=rowEnd;row++)
      {
        count++;
        arr[row][colEnd]=count;
      }
      //Traverse leftwards
      for(int col=colEnd-1;col>=colStart;col--)
      {
        count++;
        arr[rowEnd][col]=count;
      }
      //Traverse upwards
      for(int row=rowEnd-1;row>=rowStart+1;row--)
      {
        count++;
        arr[row][colStart]=count;
      }
      rowStart++;rowEnd--;
      colStart++;colEnd--;
    }
  }
  public static void main(String args[])
  {
    GenerateSpiral obj=new GenerateSpiral();
    System.out.print("Enter number of rows: ");
    int rows=sc.nextInt();
    System.out.print("Enter number of columns: ");
    int cols=sc.nextInt();
    int arr[][]=new int[rows][cols];
    obj.generateSpiral(arr);
    System.out.println("The elements of the spiral matrix are:");
    obj.display(arr);
  }//End of main()
}//End of class