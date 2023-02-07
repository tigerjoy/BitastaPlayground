// Scored - 2 points
import java.util.*;
public class OverloadedQ8
{
    // OBSERVATION #1
    // area() has not been overloaded
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("===========================");
        System.out.println("          MENU           ");
        System.out.println("===========================");
        System.out.println("1.Area of a circle");
        System.out.println("2.Area of a square");
        System.out.println("3.Area of a rectangle");
        System.out.println("===========================");
        System.out.println("Enter choice No.");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                 System.out.println("Enter radius of a circle:");
                 double r=sc.nextDouble();
                 double a=0.0;
                 a=area(r);
                 System.out.println("Area of a circle:"+a);
                 break;
                 
            case 2:
                 System.out.println("Enter side of a square:");
                 double s=sc.nextDouble();
                 double ar=0.0;
                 ar=area(s);
                 System.out.println("Area of a square:"+ar);
                 break;
                 
            case 3:
                 System.out.println("Enter length of a reactangle:");
                 double l=sc.nextDouble();
                 System.out.println("Enter breadth of a reactangle:");
                 double b=sc.nextDouble();
                 double ara=0.0;
                 ara=area(l,b);
                 System.out.println("Area of a reactangle:"+ara);
                 break;
                 
                 default: System.out.println("Wrong choice:");
                }
            }
            public static double area(double a)
               {
                   double a1=0.0;
                   a1=Math.PI*a*a;
                   return a1;
                }
            public static double area(double x)
                {
                    double a2=0.0;
                    a2=x*x;
                    return a2;
                }
            public static double area(double p, double q)
                {
                    double a3=0.0;
                    a3=p*q;
                    return a3;
                }
            }
                   
                
               
                 
   