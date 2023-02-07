import java.util.Scanner;
class BinarySearchDescending
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
  int binarySearch(int arr[], int key)
  {
    int lb=0, ub=arr.length-1;
    int pos=-1;
    while(lb<=ub)
    {
      int mid=(lb+ub)/2;
      // Key is present in the left half
      if(key>arr[mid])
      {
        ub=mid-1;
      }
      // Key is present in the right half
      else if(key<arr[mid])
      {
        lb=mid+1;
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
    BinarySearchDescending obj=new BinarySearchDescending();
    System.out.println("Enter size of the array:");
    int size=sc.nextInt();
    int arr[]=new int[size];
    obj.input(arr);
    System.out.println("Enter the element to be searched:");
    int key=sc.nextInt();
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