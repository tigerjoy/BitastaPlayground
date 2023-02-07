import java.util.Scanner;
class BubbleSortAscending
{
  static Scanner sc=new Scanner(System.in);
  void input(int arr[])
  {
    for(int i=0;i<=arr.length-1;i++)
    {
      System.out.print("Enter element "+(i+1)+": ");
      arr[i]=sc.nextInt();
    }
  }
  void display(int arr[])
  {
    for(int i=0;i<=arr.length-1;i++)
    {
      System.out.print(arr[i]+", ");
    }
    System.out.println();
  }
  void bubbleSort(int arr[])
  {
    // Size of the array
    int n=arr.length;
    for(int i=0;i<=n-2;i++)
    {
      for(int j=0;j<=n-i-2;j++)
      {
        if(arr[j]>arr[j+1])
        {
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
  }
  public static void main(String args[])
  {
    BubbleSortAscending obj=new BubbleSortAscending();
    System.out.println("Enter size of the array:");
    int size=sc.nextInt();
    int arr[]=new int[size];
    obj.input(arr);
    System.out.println("Before sorting:");
    obj.display(arr);
    obj.bubbleSort(arr);
    System.out.println("After sorting:");
    obj.display(arr);
  }//End of main()
}//End of class