// Scored - 4 points
import java.util.*;
public class Swap1
{
    public static void main()
    {
        // OBSERVATION #1
        // You need to display the values of a
        // and b before and after the swap
        Scanner sc=new Scanner(System.in);
        int a,b,c=0;
        System.out.print("ENTER VALUE OF a:");
        a=sc.nextInt();
        System.out.print("ENTER VALUE OF b:");
        b=sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("SWAPPED VALUES:");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
    