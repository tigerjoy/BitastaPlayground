import java.util.Scanner;
public class Array9
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
  int sumOfOdd(int arr[])
  {
    int sum=0;
    for(int i=0;i<=arr.length-1;i++)
    {
      if(arr[i]%2==1)
      {
        sum+=arr[i];
      }
    }
    return sum;
  }
  public static void main(String args[])
  {
    Array9 obj=new Array9();
    System.out.println("Enter the size of the array: ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    obj.input(arr);
    int sum=obj.sumOfOdd(arr);
    System.out.println("Sum of odd no.s is: "+sum);
  }//End of main()
}//End of class