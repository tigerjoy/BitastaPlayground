import java.util.Scanner;
public class Array2
{
  static Scanner sc=new Scanner (System.in);
  void input(int arr[])
  {
    for(int i=0;i<=arr.length-1;i++)
    {
      System.out.print("Enter element "+(i+1)+": ");
      arr[i] = sc.nextInt();
    }
  }
  void displayRev(int arr[])
  {
    for(int i=arr.length-1;i>=0;i--)
    {
      System.out.print(arr[i]+", ");
    }
    System.out.println();
  }
  public static void main(String args[])
  {
    Array2 obj = new Array2();
    System.out.println("Enter the size of the array:");
    int size=sc.nextInt();
    int arr[]=new int[size];
    obj.input(arr);
    System.out.println("The elements of the array in reverse are:");
    obj.displayRev(arr);
  }//End of main()
}//End of class