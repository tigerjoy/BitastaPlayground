import java.util.*;
class SeriesQ25
{
  int factorial(int num)
  {
    int prod=1;
    for(int i=num;i>=1;i--)
    {
      prod=prod*i;
    }
    return prod;
  }
  double sumOfSeries(int n, int x)
  {
    double s=1;
    for(int i=2;i<=n;i++)
    {
        s=s+Math.pow(x,i)/(double)factorial(i);
    }
    return s;
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of terms");
    int n=sc.nextInt();
    System.out.println("Enter the value of x");
    int x=sc.nextInt();
    SeriesQ25 obj=new SeriesQ25();
    System.out.println("Sum of series is "+obj.sumOfSeries(n,x));
  }
}