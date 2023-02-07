// Scored - 1.5 points
import java.util.Scanner;
class Iter2RecursionQ12
{
    int productOfFactors(int n,int i,int prod)
    {
        if(i>n)
        {
            return prod;
        }
        else if(n%i==0)
        {
            prod*=i;
            i++;
            return productOfFactors(n,i,prod);
        }
        else
        {
            i++;
            return productOfFactors(n,i,prod);
        }
    }
    public static void main(String args[])
    {
        Iter2RecursionQ12 obj=new Iter2RecursionQ12();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("The product of the factors are: "+        obj.productOfFactors(num,1,1));
        //obj.productOfFactors(num,1,1);
    }//End of main()
}//End of class
