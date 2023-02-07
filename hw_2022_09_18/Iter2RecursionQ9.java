// Scored - 1.5 points
import java.util.Scanner;
public class Iter2RecursionQ9
{    
    // StackOverflow error occurs
    int fib(int n,int i,int t1,int t2,int t3)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else if(i>n-1)
        {
            return t3;
        }
        else
        {
                t3=t1+t2;
                t1=t2;
                t2=t3;
                // Correction
                i++;
                return fib(n,i,t1,t2,t3);
        }
            
    }
    public static void main(String args[])
    {
        Iter2RecursionQ9 obj=new Iter2RecursionQ9();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter nth term: ");
        int n=sc.nextInt();
        System.out.println("The "+n+"th fibonacci term is: "+obj.fib(n,1,0,1,0));
    }//End of main()
}//End of class
    
    