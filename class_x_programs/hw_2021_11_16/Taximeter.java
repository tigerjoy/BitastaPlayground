// Scored - 3 points
import java.util.*;
public class Taximeter
{
    String name;
    int taxino, km;
    // Good job adding this data member,
    // otherwise display() wouldn't have been
    // able to access the bill amount generated
    // by calculate().
    double bill;
    Taximeter()
    {
        name="";
        taxino=0;
        km=0;
        bill=0.0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NAME:");
        name=sc.nextLine();
        System.out.println("ENTER TAXI NUMBER:");
        taxino=sc.nextInt();
        System.out.println("DISTANCE TRAVELLED IN KMS:");
        km=sc.nextInt();
    }
    // OBSERVATION #1
    // Why did you do compute the bill amount
    // like electricity bill? 
    // The questions clearly mentions the range,
    // why did you calculate like this?
    void calculate()
    {
        if(km<=1)
        {
            bill=25*km;
        }
        else if(km>1 && km<=6)
        {
            bill=(1*km)+(km-1)*10;
        }
        else if(km>6 && km<=12)
        {
            bill=(1*km)+(10*5)+(km-6)*15;
        }
        else if(km>12 && km<=18)
        {
            bill=(1*km)+(10*5)+(15*6)+(km-12)*20;
        }
        else
        {
            bill=(1*km)+(10*5)+(15*6)+(20*12)+(km-18)*25;
        }
    }
    void display()
    {
       System.out.println("TAXINO"+"\t"+"NAME"+"\t"+"KILOMETERS TRAVELLED"+"\t"+"BILL AMOUNT");
       System.out.println(taxino+"\t\t"+name+"\t\t"+km+"\t\t"+bill);
    }
    public static void main(String args[])
    {
        Taximeter obj=new Taximeter();
        obj.input();
        obj.calculate();
        obj.display();
    }
}

        
        
    
        
    
    