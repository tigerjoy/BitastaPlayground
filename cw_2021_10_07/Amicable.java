import java.util.*;
public class Amicable
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ENTER THE FIRST NUMBER:");
        int n1=sc.nextInt();
        System.out.print("ENTER THE SECOND NUMBER:");
        int n2=sc.nextInt();
        // s1 stores sum of proper divisors of
        // n1
        int s1 = 0;
        for(int i=1;i<n1;i++)
        {
            if(n1%i==0)
            {
               s1=s1+i;
            }
        }
        int s2=0;
        for(int i = 1;i<=n2/2;i++)
        {
          if(n2%i==0)
          {
            s2=s2+i;
          }
        }
        if(s1==n2 && s2==n1)
        {
          System.out.print("THEY ARE AMICABLE PAIRS");
        }
        else
        {
          System.out.print("THEY ARE NOT AMICABLE PAIRS");
        }
    }
}