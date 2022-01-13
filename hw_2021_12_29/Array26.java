// Scored - 5 points
import java.util.Scanner;
public class Array26
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
  public static void main(String args[])
  {
    Array26 obj=new Array26();
    System.out.println("Enter the size of the array: ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    obj.input(arr);
    System.out.println("The first and the last elements of the array are: ");
    System.out.println(arr[0]+", "+ arr[arr.length-1]);
  }//End of main()
}//End of class