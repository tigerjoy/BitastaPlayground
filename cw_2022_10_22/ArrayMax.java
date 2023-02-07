import java.util.Scanner;
class ArrayMax
{
  static Scanner sc=new Scanner(System.in);
  int arr[][];
  int m;
  ArrayMax(int mm)
  {
    m=mm;
    arr=new int[m][m];
  }
  void readarray()
  {
    for(int i=0;i<=m-1;i++)
    {
      for(int j=0;j<=m-1;j++)
      {
        System.out.printf("Enter element at %d,%d: ",i+1,j+1);
        arr[i][j]=sc.nextInt();
      }
    }
  }
  void large()
  {
    for(int i=0;i<=m-1;i++)
    {
      int largest=arr[i][0];
      for(int j=1;j<=m-1;j++)
      {
        if(arr[i][j]>largest)
        {
          largest=arr[i][j];
        }
      }
      System.out.println("The largest element in row "+(i+1)+" is: "+largest);
    }
  }
  void display()
  {
    for(int i=0;i<=m-1;i++)
    {
      for(int j=0;j<=m-1;j++)
      {
        System.out.print(arr[i][j]+"\t");
      }
      System.out.println();
    }
  }
  public static void main(String args[])
  {
    System.out.print("Enter size of the matrix: ");
    int size=sc.nextInt();
    ArrayMax obj=new ArrayMax(size);
    obj.readarray();
    obj.large();
    obj.display();
  }//End of main()
}//End of class 