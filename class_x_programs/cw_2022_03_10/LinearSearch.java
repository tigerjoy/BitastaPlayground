import java.util.Scanner;
class LinearSearch
{
  static Scanner sc=new Scanner(System.in);
  void input(int arr[])
  {
    for(int i=0;i<=arr.length-1;i++)
    {
      System.out.print("Enter element "+(i+1)+" : ");
      arr[i]=sc.nextInt();
    }
  }
  int linearSearch(int arr[],int key)
  {
    int pos=-1;
    for(int i=0;i<=arr.length-1;i++)
    {
       if(arr[i]==key)
       {
         pos=i;
       }
    }
    return pos;
  }
  public static void main(String args[])
  {
    LinearSearch obj=new LinearSearch();
    System.out.println("Enter size of the array: ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    obj.input(arr);
    System.out.println("Enter the element to be searched: ");
    int key=sc.nextInt();
    int pos=obj.linearSearch(arr,key);
    if(pos==-1)
    {
      System.out.println("NO SUCH ELEMENT.");
    }
    else
    {
      System.out.println(key+" is found at position "+pos);
    }
  }// End of main()
}// End of class