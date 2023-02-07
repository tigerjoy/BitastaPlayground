import java.util.Scanner;
public class SmallestOfArray16
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
  int smallestOfArray(int arr[])
  {
   int smallest=arr[0];
   for(int i=1;i<=arr.length-1;i++)
   {
     if(arr[i]<smallest)
     {
        smallest=arr[i];
     }
   }
   return smallest;
  }
  public static void main(String args[])
  {
    SmallestOfArray16 obj=new SmallestOfArray16();
    System.out.println("Enter the size of the array: ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    obj.input(arr);
    int smallest=obj.smallestOfArray(arr);
    System.out.println("Smallest element of the array is: "+smallest);
  }//End of main()
}//End of class

