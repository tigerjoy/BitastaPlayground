// Scored - 2.5 points
import java.util.Scanner;
class Iter2RecursionQ5
{
    int sumNaturalNums(int num,int sum,int i)
    {
        if(i>num)
        {
            return sum;
        }
        else
        {
            sum+=i;
            i++;
            return sumNaturalNums(num,sum,i);
        }
    }
    public static void main(String args[])
    {
        Iter2RecursionQ5 obj=new Iter2RecursionQ5();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("The sum of all natural numbers less than or equal to n: "+obj.sumNaturalNums(n,0,1));
    }//End of main()
}//End of class