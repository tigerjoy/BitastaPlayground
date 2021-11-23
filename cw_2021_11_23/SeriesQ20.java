import java.util.*;
class SeriesQ20
{
  int sumOfSeries(int n)
  {
    int s=1;
    int prev=1;
    for(int i=2;i<=n;i++)
    {
      int curr=prev*10+i;
      s=s+curr;
      prev=curr;
    }
    return s;
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of terms");
    int n=sc.nextInt();
    SeriesQ20 obj=new SeriesQ20();
    System.out.println("Sum of series is "+obj.sumOfSeries(n));
  }
}