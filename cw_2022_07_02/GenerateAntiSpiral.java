import java.util.Scanner;
class GenerateAntiSpiral
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
  void generateAntiSpiral(int arr[][])
  {
    int rows=arr.length;
    int cols=arr[0].length;
    int rowStart=0;
    int rowEnd=rows-1;
    int colStart=0;
    int colEnd=cols-1;
    int count=rows*cols;
    while(count!=0)
    {
      //Traverse rightward
      for(int col=colStart;col<=colEnd;col++)
      {
        arr[rowStart][col]=count;
        count--;
      }
      //Taverse downward
      for(int row=rowStart+1;row<=rowEnd;row++)
      {
        arr[row][colEnd]=count;
        count--;
      }
      //Traverse leftward
      for(int col=colEnd-1;col>=colStart;col--)
      {
        arr[rowEnd][col]=count;
        count--;
      }
      //Traverse upward
      for(int row=rowEnd-1;row>=rowStart+1;row--)
      {
        arr[row][colStart]=count;
        count--;
      }
      rowStart++;rowEnd--;
      colStart++;colEnd--;
    }
  }
  public static void main(String args[])
  {
      GenerateAntiSpiral obj=new GenerateAntiSpiral();
      System.out.print("Enter number of rows: ");
      int rows=sc.nextInt();
      System.out.print("Enter number of columns: ");
      int cols=sc.nextInt();
      int arr[][]=new int[rows][cols];
      obj.generateAntiSpiral(arr);
      System.out.println("The elements of the anti spiral matrix are:");
      obj.display(arr);
    }//End of main()
  }//End of class