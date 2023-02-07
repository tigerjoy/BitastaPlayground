import java.util.Scanner;
class CalculateDoubleArray
{
  static Scanner sc=new Scanner(System.in);
  void input(double arr[])
  {
    for(int i=0;i<=arr.length-1;i++)
    {
      System.out.print("Enter Element "+(i+1)+" :");
      arr[i]=sc.nextDouble();
    }
  }
  double calculateSum(double arr[])
  {
    double sum=0;
    for(int i=0;i<=arr.length-1;i++)
    {
      sum+=arr[i];
    }
    return sum;
  }
  double calculateHighest(double arr[])
  {
    double largest=arr[0];
    for(int i=0;i<=arr.length-1;i++)
    {
      if(arr[i]>largest)
      {
        largest=arr[i];
      }
    }
    return largest;
  }
  public static void main(String args[])
  {
    CalculateDoubleArray obj=new CalculateDoubleArray();
    double arr[]=new double[20];
    obj.input(arr);
    System.out.println("The sum of the elements: "+obj.calculateSum(arr));
    System.out.println("The highest element is: "+obj.calculateHighest(arr));
  }// End of main()
}// End of class