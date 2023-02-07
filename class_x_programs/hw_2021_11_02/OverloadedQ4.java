// Scored - 1 point
public class OverloadedQ3
{
    public static double series(double n)
    {
        double sum=0.0;
        for(int i=1;i<=n;i++)
        {
          // OBSERVATION #1
          // The sum will always be 0.
            sum=sum+1/i;
        }
        return sum;
    }
    public static double series(double a, double n)
    {
        double sum=0.0;
        // OBSERVATION #2
        // Wrong logic.
        for(int i=1;i<=n;i=i+3)
        {
            sum=sum+i/a*Math.pow(a,i);
        }
        return sum;
    }
}