import java.util.Scanner;
class SumOfArrays
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
  void display(int arr[])
  {
    for(int i=0;i<=arr.length-1;i++)
    {
      System.out.print(arr[i]+", ");
    }
    System.out.println();
  }
  int[] sumOfArrays(int arr1[],int arr2[])
  {
    int sum[]=new int[arr1.length];
    for(int i=0;i<=sum.length-1;i++)
    {
      sum[i]=arr1[i]+arr2[i];
    }
    return sum;
  }
  public static void main(String args[])
  {
    SumOfArrays obj=new SumOfArrays();
    System.out.println("Enter size of the array: ");
    int size=sc.nextInt();
    int arr1[]=new int[size];
    int arr2[]=new int[size];
    System.out.println("Enter elements of arr1: ");
    obj.input(arr1);
    System.out.println("Enter elements of arr2: ");
    obj.input(arr2);

    int sum[]=obj.sumOfArrays(arr1,arr2);

    System.out.println("Elements of arr1: ");
    obj.display(arr1);
    System.out.println("Elements of arr2: ");
    obj.display(arr2);
    System.out.println("The summation array is:");
    obj.display(sum);
  }// End of main()
}// End of class