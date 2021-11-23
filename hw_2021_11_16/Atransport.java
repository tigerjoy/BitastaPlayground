// Scored - 5 points
import java.util.*;
public class Atransport
{
    String name;
    int w, charge;
    // OBSERVATION #1
    // It is commendable that you've written
    // a default constructor here, but was it 
    // asked in the question?
    Atransport()
    {
        name="";
        w=0;
        charge=0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NAME:");
        name=sc.nextLine();
        System.out.println("ENTER WEIGHT IN KGS:");
        w=sc.nextInt();
    }
    void calculate()
    {
        if(w<=10)
        {
            charge=25*w;
        }
        else if(w>10 && w<=30)
        {
            charge=(25*10)+(w-10)*20;
        }
        else 
        {
           charge=(25*10)+(20*20)+(w-30)*10;
        }
    }
    void print()
    {
       System.out.println("NAME"+"\t"+"WEIGHT OF THE PARCEL"+"\t"+"CHARGE");
       System.out.println(name+"\t\t"+w+"\t\t"+charge);
    } 
    public static void main(String args[])
    {
        Atransport obj=new Atransport();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}

        
        
    
        
    
    