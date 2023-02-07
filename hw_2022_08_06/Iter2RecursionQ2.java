// Scored - 2.5 points
import java.util.Scanner;
class Iter2RecursionQ2
{
    int pow(int a,int b,int prod,int i)
    {
        if(i>b)
        {
            return prod;
        }
        else
        {
            prod=prod*a;
            i++;
            return pow(a,b,prod,i);
        }
    }
    public static void main(String args[])
    {
        Iter2RecursionQ2 obj=new Iter2RecursionQ2();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base: ");
        int a=sc.nextInt();
        System.out.print("Enter power: ");
        int b=sc.nextInt();
        System.out.println("The result :"+obj.pow(a,b,1,1));
    }//End of main()
}//End of class