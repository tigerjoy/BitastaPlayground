// Scored - 9 points
import java.util.Scanner;
class Happy
{
    int n;
    Happy()
    {
        n=0;
    }
    void getnum(int nn)
    {
        n=nn;
    }
    // There is a logical mistake here
    // sum_sq_digits(x) is not supposed
    // to return the ultimate sum when the
    // is a single digit number, but return only
    // the sum of digits of x recursively.
    // Though the program runs, this is slightly
    // wrong because sum_sq_digits() tries to 
    // do more than what it is meant to do
    // The while loop should be present in
    // isHappy() and that should call
    // sum_sq_digits() repeatedly until the
    // sum returned is a single digit number
    int sum_sq_digits(int x)
    {
        int sum=0;
        while(x>0)
        {
            int dig=x%10;
            sum+=dig*dig;
            x/=10;
        }
        if(sum>10)
        {
            return sum_sq_digits(sum);
        }
        else
        {
            return sum;
        }
    }
    void ishappy()
    {
        int sum=sum_sq_digits(n);
        if(sum==1)
        {
            System.out.println("IT IS A HAPPY NUMBER");
        }
        else
        {
            System.out.println("IT IS NOT A HAPPY NUMBER");
           
        }
    }
    public static void main(String args[])
    {
        Happy obj=new Happy();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        obj.getnum(num);
        obj.ishappy();
    }//End of main()
}//End of class
