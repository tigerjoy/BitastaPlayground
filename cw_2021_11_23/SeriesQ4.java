import java.util.*;
class SeriesQ4
{
  double sumOfSeries(int n)
  {
    double s=1.0/2.0;
    for(int i=2;i<=n;i++)
    {
      if(i%2==0)
      {
        s=s-(double)i/(i+1);
      }
      else
      {
        s=s+(double)i/(i+1);
      }
    }
    return s;
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of terms");
    int n=sc.nextInt();
    SeriesQ4 obj=new SeriesQ4();
    System.out.println("Sum of series is "+obj.sumOfSeries(n));
  }
}