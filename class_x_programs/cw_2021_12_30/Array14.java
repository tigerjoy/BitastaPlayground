import java.util.Scanner;
public class Array14
{
  static Scanner sc=new Scanner(System.in);
  void input(int arr[])
  {
    for (int i=0;i<=arr.length-1;i++)
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
  double averageOfArray(int arr[])
  {
    int sum=sumOfArray(arr);
    double average=(double)(sum)/arr.length;
    return average;
  }
  public static void main(String args[])
  {
    Array14 obj=new Array14();
    System.out.println("Enter size of the array: ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    obj.input(arr);
    double average=obj.averageOfArray(arr);
    System.out.println("The average of the elements of array is: "+average);
  }//End of main()
}//End of class
