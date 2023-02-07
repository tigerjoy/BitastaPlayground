// Scored - 2.5 points
import java.util.Scanner;
class RecursionQ18
{
    int lcm(int n1, int n2, int l)
    {
        if(l%n1==0 && l%n2==0)
        {
            return l;
        }
        else
        {
            return lcm(n1,n2,l+1);
        }
    }
    public static void main(String args[])
    {
        RecursionQ18 obj=new RecursionQ18();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int lcm=obj.lcm(n1,n2,1);
        System.out.println("LCM of the numbers is: "+lcm);
    }// End of main()
}//End of class