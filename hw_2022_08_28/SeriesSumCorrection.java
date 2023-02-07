// Scored - 6 points
import java.util.Scanner;
class SeriesSumCorrection
{
    int x,n;
    double sum;
    SeriesSumCorrection(int xx, int nn)
    {
        x=xx;
        n=nn;
        sum=0.0;
    }
    // Suggestion to use m == 0 as the 
    // base condition as 0! = 1
    double findFact(int m)
    {
        if(m==0)
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
        for(int i=1;i<=n;i++)
        {
            sum+=findPower(x,(i*2))/findFact((i*2)-1);
        }
    }
    void display()
    {
        System.out.println("The sum of the series is: "+sum);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of x: ");
        int xx=sc.nextInt();
        System.out.print("Enter number of terms: ");
        int nn=sc.nextInt();
        SeriesSumCorrection obj=new SeriesSumCorrection(xx,nn);
        obj.calculate();
        obj.display();
    }//End of main()
}//End of class
    