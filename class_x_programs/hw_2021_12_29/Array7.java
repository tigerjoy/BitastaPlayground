// Scored - 5 points
import java.util.Scanner;
public class Array7
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
  void displayNumbersG10(int arr[])
  {
      for(int i=0;i<=arr.length-1;i++)
      {
          if(arr[i]>10)
          {
              System.out.print(arr[i]+", ");
          }
      }
      System.out.println();
  }
  public static void main(String args[])
  {
    Array7 obj=new Array7();
    System.out.println("Enter the size of the array: ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    obj.input(arr);
    System.out.println("The elements of array which are greater than 10 are: ");
    obj.displayNumbersG10(arr);
  }//End of main()
}//End of class