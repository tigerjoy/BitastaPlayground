// Scored - 5 points
import java.util.Scanner;
public class Array6
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
  void displayOdd(int arr[])
  {
      for(int i=0;i<=arr.length-1;i++)
      {
          if(arr[i]%2==1)
          {
              System.out.print(arr[i]+", ");
          }
      }
      System.out.println();
  }
  public static void main(String args[])
  {
    Array6 obj=new Array6();
    System.out.println("Enter the size of the array: ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    obj.input(arr);
    System.out.println("The elements of array which are odd are: ");
    obj.displayOdd(arr);
  }//End of main()
}//End of class