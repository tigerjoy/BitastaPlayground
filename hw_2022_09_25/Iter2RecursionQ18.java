// Scored - 2 points
import java.util.Scanner;
class Iter2RecursionQ18
{
    int lcm(int n1, int n2, int f, int lcm)
    {
        // This condition is wrong
        // What should be the lcm of lcm(16, 1, 2, 1)?
        // if(n1==1 || n2==1) // <-- Mistake
        if (n1 == 1 &&  n2 == 1)
        {
            return lcm;
        }
        else
        {
            if(n1%f==0 && n2%f==0)
            {
                n1/=f;
                n2/=f;
                lcm*=f;
            }
            else if(n1%f==0)
            {
                n1/=f;
                lcm*=f;
            }
            else if(n2%f==0)
            {
                n2/=f;
                lcm*=f;
            }
            else
            {
                f++;
            }
            return lcm(n1,n2,f,lcm);
        }
    }
    public static void main(String args[])
    {
        Iter2RecursionQ18 obj=new Iter2RecursionQ18();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int lcm=obj.lcm(n1,n2,2,1);
        System.out.println("LCM of the numbers is: "+lcm);
    }// End of main()
}//End of class