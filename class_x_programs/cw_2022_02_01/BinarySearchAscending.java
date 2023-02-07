import java.util.Scanner;
class BinarySearchAscending
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
  void bubbleSort(int arr[])
  {
    // Size of the array
    int n=arr.length;
    for(int i=0;i<=n-2;i++)
    {
      for(int j=0;j<=n-i-2;j++)
      {
        // For Ascending Order
        if(arr[j]>arr[j+1])
        {
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
  }
  int binarySearch(int arr[], int key)
  {
    int lb=0, ub=arr.length-1;
    int pos=-1;
    while(lb<=ub)
    {
      int mid=(lb+ub)/2;
      // Key is present in the right half
      if(key>arr[mid])
      {
        lb=mid+1;
      }
      // Key is present in the left half
      else if(key<arr[mid])
      {
        ub=mid-1;
      }
      else
      {
        pos=mid;
        break;
      }
    }
    return pos;
  }
  public static void main(String args[])
  {
    BinarySearchAscending obj=new BinarySearchAscending();
    System.out.println("Enter size of the array:");
    int size=sc.nextInt();
    int arr[]=new int[size];
    obj.input(arr);
    System.out.println("Enter the element to be searched:");
    int key=sc.nextInt();

    // Sort the array in ascending order
    obj.bubbleSort(arr);

    int pos=obj.binarySearch(arr,key);
    if(pos==-1)
    {
      System.out.println(key+" is not found");
    }
    else
    {
      System.out.println(key+" is found");
    }
  }//End of main()
}//End of class