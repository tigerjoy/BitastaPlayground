// Scored - 6 points
import java.util.Scanner;
class SeriesSum
{
    int x,n;
    double sum;
    SeriesSum(int xx, int nn)
    {
        x=xx;
        n=nn;
        sum=0.0;
    }
    // Suggestion to use m == 0 as the 
    // base condition as 0! = 1
    double findFact(int m)
    {
        if(m==1)
        {
            return 1.0;
        }
        else
        {
            return m*findFact(m-1);
        }
    }
    double findPower(int x,int y)
    {
        if(y==0)
        {
            return 1.0;
        }
        else
        {
            return x*findPower(x,y-1);
        }
    }
    // If n = 3, will three terms be added
    // to sum?
    void calculate()
    {
        for(int i=2;i<=n;i=i+2)
        {
            sum+=findPower(x,i)/findFact(i-1);
        }
    }
    void display()
    {
        System.out.println("The sum of the series is: "+sum);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int nn=sc.nextInt();
        System.out.print("Enter number of terms: ");
        int xx=sc.nextInt();
        SeriesSum obj=new SeriesSum(nn,xx);
        obj.calculate();
        obj.display();
    }//End of main()
}//End of class
    