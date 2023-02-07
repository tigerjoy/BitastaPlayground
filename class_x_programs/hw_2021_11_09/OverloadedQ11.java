// Scored - 5 points
public class OverloadedQ11
{
    double series(double n)
    {
        double s=1.0, f=1.0;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
            s=s+f;
        }
        return s;
    }
    double series(double x, double n)
    {
        double x1=0.0, s=0.0;
        for(int i=1;i<=n;i++)
        {
            x1=Math.pow(x,i);
            s=s+x1/(i*i);
        }
        return s;
    }
}
            