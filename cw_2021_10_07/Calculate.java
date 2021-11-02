import java.util.*;
public class Calculate
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,s=0,d=0,m=0,r=0,q=0;
        double di=0.0;
        System.out.print("ENTER FIRST NUMBER:");
        a=sc.nextInt();
        System.out.print("ENTER SECOND NUMBER:");
        b=sc.nextInt();
        s=a+b;
        d=a-b;
        m=a*b;
        di=(double)(a)/b;
        r=a%b;
        q=a/b;
        System.out.println(a+"+"+b+"="+s);
        System.out.println(a+"-"+b+"="+d);
        System.out.println(a+"*"+b+"="+m);
        System.out.println(a+"/"+b+"="+di);
        System.out.println(a+"%"+b+"="+r);
        System.out.println(a+"//"+b+"="+q);
    }
}
