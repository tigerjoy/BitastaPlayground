// Scored - 10 points
import java.util.Scanner;
class Combination
{
    static Scanner sc=new Scanner(System.in);
    int n,k;
    double comb;
    Combination()
    {
        n=0;
        k=0;
        comb=0.0;
    }
    void read()
    {
       System.out.print("Enter the value of n: ");
       n=sc.nextInt();
       System.out.print("Enter the value of k: ");
       k=sc.nextInt();
    }
    int fact(int num)
    {
        if(num==1)
        {
            return 1;
        }
        else
        {
            return num*fact(num-1);
        }
    }
    // Suggestion when dividing
    void compute()
    {
        comb=fact(n)/(double)(fact(k)*fact(n-k));
    }
    void display()
    {
        System.out.println("The combination value of "+n+" and "+k+" is: "+comb);
    }
    public static void main(String args[])
    {
        Combination obj=new Combination();
        obj.read();
        obj.compute();
        obj.display();
    }// End of main()
}// End of class
        
        