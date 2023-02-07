import java.util.*;
class SeriesQ3
{
  double sumOfSeries(int n)
  {
    double s=1.0/2.0;
    for(int i=2;i<=n;i++)
    {
      s=s+(double)i/(i+1);
    }
    return s;
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of terms");
    int n=sc.nextInt();
    SeriesQ3 obj=new SeriesQ3();
    System.out.println("Sum of series is "+obj.sumOfSeries(n));
  }
}