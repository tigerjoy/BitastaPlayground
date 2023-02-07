import java.util.*;
public class ParkingLot
{
    int vno;
    int hours;
    double bill;
    ParkingLot()
    {
        vno=0;
        hours=0;
        bill=0.0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER VEHICLE NUMBER:");
        vno=sc.nextInt();
        System.out.println("ENTER NUMBER OF HOURS:");
        hours=sc.nextInt();
    }
    void calculate()
    {
        if(hours<=1)
        {
            bill=hours*3;
        }
        else 
        {
            bill=3+(hours-1)*1.50;
        }
        
    }
    void display()
    {
       System.out.println("VEHICLE NUMBER:"+vno);
       System.out.println("HOURS:"+hours);
       System.out.println("BILL:"+bill);
    }
    public static void main(String args[])
    {
        ParkingLot obj=new ParkingLot();
        obj.input();
        obj.calculate();
        obj.display();
    }
}

        
        
    
        
    