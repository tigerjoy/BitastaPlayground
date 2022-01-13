import java.util.Scanner;
class LinearSearchV1
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
  int linearSearch(int arr[], int key)
  {
    int pos=-1;
    for(int i=0;i<=arr.length-1;i++)
    {
      if(key==arr[i])
      {
        pos=i;
        break;
      }
    }
    return pos;
  }
  public static void main(String args[])
  {
    LinearSearchV1 obj=new LinearSearchV1();
    System.out.println("Enter size of the array: ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    obj.input(arr);
    System.out.println("Enter element to be searched: ");
    int key=sc.nextInt();
    int pos=obj.linearSearch(arr,key);
    if(pos==-1)
    {
      System.out.println(key+" was not found in the array");
    }
    else
    {
      System.out.println(key+" was found at position "+pos);
    }
  }//end of main()
}//end of class