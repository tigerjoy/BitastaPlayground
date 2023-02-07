import java.util.Scanner;
public class Array9A
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
  int productOfArray(int arr[])
  {
    int prod=1;
    for(int i=0;i<=arr.length-1;i++)
    {
      prod*=arr[i];
    }
    return prod;
  }
  public static void main(String args[])
  {
    Array9A obj=new Array9A();
    System.out.println("Enter the size of the array: ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    obj.input(arr);
    int prod=obj.productOfArray(arr);
    System.out.println("Product of array elements is: "+prod);
  }//End of main()
}//End of class