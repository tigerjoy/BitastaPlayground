// Scored - 2.5 points
import java.util.Scanner;
class Iter2RecursionQ13
{
    void displayFactors(int n,int i)
    {
        if(i>n)
        {
            return;
        }
        else if(n%i==0)
        {
            System.out.print(i+", ");
            i++;
            displayFactors(n,i);
        }
        else
        {
            i++;
            displayFactors(n,i);
        }
    }
    public static void main(String args[])
    {
        Iter2RecursionQ13 obj=new Iter2RecursionQ13();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("The factors are: ");
        obj.displayFactors(num,1);
    }//End of main()
}//End of class
