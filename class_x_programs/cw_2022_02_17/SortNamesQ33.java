import java.util.Scanner;
class SortNamesQ33
{
  static Scanner sc=new Scanner(System.in);
  void input(String arr[])
  {
    for(int i=0;i<=arr.length-1;i++)
    {
      System.out.print("Enter element "+(i+1)+": ");
      arr[i]=sc.nextLine();
    }
  }
  void display(String arr[])
  {
    for(int i=0;i<=arr.length-1;i++)
    {
      System.out.print(arr[i]+", ");
    }
    System.out.println();
  }
  void bubbleSort(String arr[])
  {
    int n=arr.length;
    for(int i=0;i<=n-1;i++)
    {
      for(int j=0;j<=n-i-2;j++)
      {
        if(arr[j].compareTo(arr[j+1])>0)
        {
          String temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
  }
  public static void main(String args[])
  {
    SortNamesQ33 obj=new SortNamesQ33();
    System.out.println("Enter size of the array: ");
    int n=sc.nextInt();
    sc.nextLine();
    String arr[]=new String[n];
    obj.input(arr);
    System.out.println("Before sorting: ");
    obj.display(arr);
    obj.bubbleSort(arr);
    System.out.println("After sorting: ");
    obj.display(arr);
  }// End of main()
}// End of class