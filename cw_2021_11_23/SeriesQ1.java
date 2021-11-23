import java.util.*;
class SeriesQ1
{
  int sumOfSeries(int n)
  {
    int s=1;
    for(int i=2;i<=n;i++)
    {
      s=s+i;
    }
    return s;
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of terms");
    int n=sc.nextInt();
    SeriesQ1 obj=new SeriesQ1();
    System.out.println("Sum of series is "+obj.sumOfSeries(n));
  }
}