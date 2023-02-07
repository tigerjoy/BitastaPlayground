import java.util.Scanner;
public class Array8
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
  int sumOfArray(int arr[])
  {
    int sum=0;
    for(int i=0;i<=arr.length-1;i++)
    {
      sum+=arr[i];
    }
    return sum;
  }
  public static void main(String args[])
  {
    Array8 obj=new Array8();
    System.out.println("Enter the size of the array: ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    obj.input(arr);
    int sum=obj.sumOfArray(arr);
    System.out.println("The sum of array elements is: "+sum);
  }//End of main()
}//End of class