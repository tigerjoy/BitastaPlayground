// Scored - 2.5 points
import java.util.Scanner;
class RecursionQ2
{
    int pow(int a,int b)
    {
        if(b==0)
        {
            return 1;
        }
        else
        {
            return a*pow(a,b-1);
        }
    }
    public static void main(String args[])
    {
        RecursionQ2 obj=new RecursionQ2();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base: ");
        int a=sc.nextInt();
        System.out.print("Enter power: ");
        int b=sc.nextInt();
        System.out.println("The result :"+obj.pow(a,b));
    }//End of main()
}//End of class