// Scored - 1 points
import java.util.Scanner;
class RecursionQ12
{
    int productOfFactors(int n,int f)
    {
        if(f>n)
        {
            return 1;
        }
        else if(n%f==0)
        {
            return f*productOfFactors(n,f+1);
        }
        else
        {
            return productOfFactors(n,f+1);
        }
    }
    public static void main(String args[])
    {
        RecursionQ12 obj=new RecursionQ12();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("The product of the factors are: "+obj.productOfFactors(num,1));
       // obj.productOfFactors(num,1);
    }//End of main()
}//End of class
