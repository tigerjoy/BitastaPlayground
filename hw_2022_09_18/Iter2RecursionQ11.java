// Scored - 1.5 points
import java.util.Scanner;
class Iter2RecursionQ11
{
    int sumOfFactors(int n,int i,int sum)
    {
        if(i>n)
        {
            return sum;
        }
        else if(n%i==0)
        {
                sum+=i;
                i++;
                return sumOfFactors(n,i,sum);
        }
        else
        {
            i++;
            return sumOfFactors(n,i,sum);
        }
    }
    // No output is displayed 
    public static void main(String args[])
    {
        Iter2RecursionQ11 obj=new Iter2RecursionQ11();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        // Correction  
        System.out.println("The sum of the factors are: " +
          obj.sumOfFactors(num,1,0));
        // obj.sumOfFactors(num,1,0);
    }//End of main()
}//End of class
