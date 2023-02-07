// Scored - 5 points
import java.util.*;
public class Vote
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,x=0;
        System.out.print("ENTER AGE:");
        a=sc.nextInt();
        x=18-a;
        if(a>=18)
        System.out.println("YOU ARE ELIGIBLE TO VOTE!");
        else
        System.out.print("COME BACK AFTER "+x+" YEARS!");
    }
}
    