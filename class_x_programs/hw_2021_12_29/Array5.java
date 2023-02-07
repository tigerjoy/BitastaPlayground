// Scored - 5 points
import java.util.Scanner;
public class Array5
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
  void displaySquareG10(int arr[])
  {
      for(int i=0;i<=arr.length-1;i++)
      {
         if(arr[i]>10)
         {
            System.out.print((arr[i]*arr[i])+", ");
         }
      }
      System.out.println();
  }
  
  public static void main(String args[])
  {
    Array5 obj=new Array5();
    System.out.println("Enter the size of the array: ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    obj.input(arr);
    System.out.println("The square elements of the array greater than 10 are: ");
    obj.displaySquareG10(arr);
  }//End of main()
}//End of class