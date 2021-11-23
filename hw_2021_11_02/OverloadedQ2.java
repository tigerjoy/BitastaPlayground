// Scored - 5 points
public class OverloadedQ2
{
   double SumSeries(int n, double x)
    {
        double sum=0.0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                sum=sum-(x/i);
            }
            else
            {
                sum=sum+(x/i);
            }
        }
        return sum;
    }
   double SumSeries()
    {
        int sum=0;
        // OBSERVATION #1
        // This code can be further shortened.
        for(int i=1;i<=20;i++)
        {
            int p=1;
            for(int j=1;j<=i;j++)
            {
               p=p*j;
            }
            sum=sum+p;
        }
        return sum;
    }
}