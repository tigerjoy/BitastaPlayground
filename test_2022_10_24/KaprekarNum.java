// Scored - 5/5 points
import java.util.Scanner;
class KaprekarNum
{
    int p,q;
    KaprekarNum(int p, int q)
    {
        this.p=p;
        this.q=q;
    }
    boolean isKaprekar(int n)
    {
        String lhStr="";
        String rhStr="";
        int lh=0,rh=0;
        int sq=n*n;
        String str=Integer.toString(sq);
        int length=str.length();
        if(length>1)
        {
            for(int i=0;i<=(length/2)-1;i++)
            {
                lhStr+=str.charAt(i);
            }
            for(int i=length/2;i<=length-1;i++)
            {
                rhStr+=str.charAt(i);
            }
            lh=Integer.parseInt(lhStr);
            rh=Integer.parseInt(rhStr);
        }
        else
        {
            lh=0;
            rh=Integer.parseInt(str);
        }
        int sum=lh+rh;
        return sum==n;
    }
    void display()
    {
        int f=0;
        for(int i=p;i<=q;i++)
        {
            if(isKaprekar(i))
            {
                f++;
                System.out.print(i+",");
            }
        }
        System.out.println("\nFREQUENCY OF KARPEKAR NUMBERS IS: "+f);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("P = ");
        int P=sc.nextInt();
        System.out.print("Q = ");
        int Q=sc.nextInt();
        if(P<Q && P<5000 && Q<5000)
        {
            KaprekarNum obj=new KaprekarNum(P,Q);
            System.out.println("THE KARPEKAR NUMBERS ARE:- ");
            obj.display();
        }
        else
        {
            System.out.println("INVALID VALUES OF P AND Q");
        }
    }// End of main()
}// End of class