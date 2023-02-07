// Scored - 2.5 points
import java.util.Scanner;
class Iter2RecursionQ7
{
    int count(int num,int count)
    {
        if(num<=0)
        {
            return count;
        }
        else
        {
            int dig=num%10;
            count++;
            num/=10;
            return count(num,count);
        }
    }
    public static void main(String args[])
    {
        Iter2RecursionQ7 obj=new Iter2RecursionQ7();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("The number of the digits is: "+obj.count(n,0));
    }//End of main()
}//End of class