// Scored - 5 points
import java.util.Scanner;
public class Array25
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
  void doubleArray(int arr[])
  {
      for(int i=0;i<=arr.length-1;i++)
      {
          arr[i]=2*arr[i];
      }
  }
  public static void main(String args[])
  {
    Array25 obj=new Array25();
    System.out.println("Enter the size of the array: ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    obj.input(arr);
    System.out.println("The elements of array before doubling: ");
    obj.display(arr);
    obj.doubleArray(arr);
    System.out.println("The elements of array after doubling: ");
    obj.display(arr);
  }//End of main()
}//End of class