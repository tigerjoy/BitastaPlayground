// Scored - 2.5 points
import java.util.Scanner;
class RecursionQ13
{
    void displayFactors(int n,int f)
    {
        if(f>n)
        {
            System.out.println();
        }
        else if(n%f==0)
        {
            System.out.print(f+", ");
            displayFactors(n,f+1);
        }
        else
        {
            displayFactors(n,f+1);
        }
    }
    public static void main(String args[])
    {
        RecursionQ13 obj=new RecursionQ13();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("The factors of the number are: ");
        obj.displayFactors(num,1);
    }//End of main()
}//End of class
