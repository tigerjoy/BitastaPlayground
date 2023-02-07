// Scored - 3 points
public class OverloadedQ10_2
{
   void pattern(char ch, int n)
   {
       for(int r=1;r<=n;r++)
       {
           for(int c=1;c<=r;c++)
           {
               System.out.print(""+ch);
            }
            System.out.println();
        }
    }
    // OBSERVATION #1
    // The term x/n is not added to the sum.
    double pattern(double x, double n)
    {
        double s=0.0;
        for(int i=1;i<=n-1;i++)
        {
            double n1=n-i;
            s=s+x/n1;
        }
        return s;
    }
}
    