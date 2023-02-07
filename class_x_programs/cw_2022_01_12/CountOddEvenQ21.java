import java.util.Scanner;
class CountOddEvenQ21
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
  int countItemsOdd(int arr[])
  {
    int count=0;
    for(int i=0;i<=arr.length-1;i++)
    {
      if (arr[i]%2==1)
      {
        count++;
      }
    }
    return count;
  }
  int countItemsEven(int arr[])
  {
    int count=0;
    for(int i=0;i<=arr.length-1;i++)
    {
      if (arr[i]%2==0)
      {
        count++;
      }
    }
    return count;
  }
  public static void main(String args[])
  {
    CountOddEvenQ21 obj=new CountOddEvenQ21();
    System.out.println("Enter size of the array: ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    obj.input(arr);
    System.out.println("Number of odd elements in the array is: "+obj.countItemsOdd(arr));
    System.out.println("Number of even elements in the array is: "+obj.countItemsEven(arr));
  }//End of main()
}//End of class