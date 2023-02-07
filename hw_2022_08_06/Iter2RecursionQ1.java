// Scored - 2.5 points
import java.util.Scanner;
class Iter2RecursionQ1
{
    int fact(int num,int fact,int i)
    {
        if(i<1)
        {
            return fact;
        }
        else
        {
            fact=fact*i;
            i--;
            return fact(num,fact,i);
        }
    }
    public static void main(String args[])
    {
        Iter2RecursionQ1 obj=new Iter2RecursionQ1();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("The factorial of the number is: "+obj.fact(num,1,num));
    }//End of main()
}//End of class