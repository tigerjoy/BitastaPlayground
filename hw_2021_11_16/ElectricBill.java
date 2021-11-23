// Scored - 5 points
import java.util.*;
// OBSERVATION #1
// For repl.it, the name of the file and the class
// name should be same.
// OLD:
// public class ElectricityBill
// NEW:
public class ElectricBill
{
    String n;
    int units;
    double bill;
    // OBSERVATION #1
    // It is commendable that you've written
    // a default constructor here, but was it 
    // asked in the question?
    ElectricBill()
    {
        n="";
        units=0;
        bill=0.0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NAME:");
        n=sc.nextLine();
        System.out.println("ENTER UNITS CONSUMED:");
        units=sc.nextInt();
    }
    void calculate()
    {
        if(units<=100)
        {
            bill=2.00*units;
        }
        else if(units>=101 && units<=300)
        {
            bill=(100*2.00)+(units-100)*3.00;
        }
        else if(units>=301)
        {
            bill=(100*2.00)+(200*3.00)+(units-300)*5.00;
        }
    }
    void print()
    {
       System.out.println("NAME OF THE CUSTOMER:"+n);
       System.out.println("NUMBERS OF UNITS CONSUMED:"+units);
       System.out.println("BILL AMOUNT:"+bill);
      
    } 
    public static void main(String args[])
    {
        // OLD:
        // ElectricityBill obj=new ElectricityBill();
        // NEW:
        ElectricBill obj=new ElectricBill();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}

        
        
    
        
    
    
    