// Scored - 5 points
import java.util.Scanner;
public class Array3
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
  void displayExcept7Or9(int arr[])
  {
      for(int i=0;i<=arr.length-1;i++)
      {
          if(arr[i]!=7 && arr[i]!=9)
          {
              System.out.print(arr[i]+", ");
          }
      }
      System.out.println();
  }
  public static void main(String args[])
  {
    Array3 obj=new Array3();
    System.out.println("Enter the size of the array: ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    obj.input(arr);
    System.out.println("The elements of array except 7 or 9 are: ");
    obj.displayExcept7Or9(arr);
  }//End of main()
}//End of class