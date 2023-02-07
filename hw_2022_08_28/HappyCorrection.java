// Scored - 9 points
import java.util.Scanner;
class HappyCorrection
{
    int n;
    HappyCorrection()
    {
        n=0;
    }
    void getnum(int nn)
    {
        n=nn;
    }
    int sum_sq_digits(int x)
    {
      if(x>=0 && x<=9)
      {
        return x*x;
      }
      else
      {
        int dig=x%10;
        return sum_sq_digits(x/10)+(dig*dig);
      }
    }
    void ishappy()
    {
        int sum=sum_sq_digits(n);
        // n = 28
        // sum = 68 -> 100 -> 1
        while(sum>=10)
        {
          sum=sum_sq_digits(sum);
        }
        if(sum==1)
        {
            System.out.println("IT IS A HAPPY NUMBER");
        }
        else
        {
            System.out.println("IT IS NOT A HAPPY NUMBER");
        }
    }
    public static void main(String args[])
    {
        HappyCorrection obj=new HappyCorrection();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        obj.getnum(num);
        obj.ishappy();
    }//End of main()
}//End of class
