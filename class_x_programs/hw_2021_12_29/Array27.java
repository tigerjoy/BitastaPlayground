// Scored - 5 points
import java.util.Scanner;
public class Array27
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
  void operate(int arr[])
  {
      for(int i=0;i<=arr.length-1;i++)
      {
         if(arr[i]%2==0)
         {
             arr[i]=(int)((1.0/2.0)*arr[i]);
         }
         else
         {
             arr[i]=2*arr[i];
         }
      }
  }
  public static void main(String args[])
  {
    Array27 obj=new Array27();
    System.out.println("Enter the size of the array: ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    obj.input(arr);
    System.out.println("The elements of array before operation: ");
    obj.display(arr);
    obj.operate(arr);
    System.out.println("The elements of array after operation: ");
    obj.display(arr);
  }//End of main()
}//End of class