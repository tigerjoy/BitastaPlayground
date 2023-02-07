import java.util.Scanner;
public class Array10
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
  int productOfEven(int arr[])
  {
    int prod=1;
    for(int i=0;i<=arr.length-1;i++)
    {
      if(arr[i]%2==0)
      {
        prod*=arr[i];
      }
    }
    return prod;
  }
  public static void main(String args[])
  {
    Array10 obj=new Array10();
    System.out.println("Enter the size of the array: ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    obj.input(arr);
    
    int sumOdd=obj.sumOfOdd(arr);
    int prodEven=obj.productOfEven(arr);
    System.out.println("The sum of the odd numbers is: "+sumOdd);
    System.out.println("The product of the even numbers is: "+prodEven);
    
  }//End of main()
}//End of class