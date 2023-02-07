// Scored - 5 points
import java.util.*;
public class ShowRoom
{
    String name;
    long mobno;
    double cost, dis, amount;
    ShowRoom()
    {
        name="";
        mobno=0;
        cost=0.0;
        dis=0.0; 
        amount=0.0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NAME:");
        name=sc.nextLine();
        System.out.println("ENTER MOBILE NUMBER:");
        mobno=sc.nextLong();
        System.out.println("ENTER COST:");
        cost=sc.nextDouble();
    }
    // OBSERVATION #1
    // This code can be improved upon,
    // Look at the statement for calculating
    // amount.
    void calculate()
    {
        if(cost<=10000)
        {
            dis=cost*5/100.0;
            amount=cost-dis;
        }
        else if(cost>10000 && cost<=20000)
        {
            dis=cost*10/100.0;
            amount=cost-dis;
        }
        else if(cost>20000 && cost<=35000)
        {
            dis=cost*15/100.0;
            amount=cost-dis;
        }
        else
        {
            dis=cost*20/100.0;
            amount=cost-dis;
        }
    }
    void display()
    {
       System.out.println("NAME:"+name);
       System.out.println("MOBILE NUMBER:"+mobno);
       System.out.println("AMOUNT:"+amount);
    }
    public static void main(String args[])
    {
        ShowRoom obj=new ShowRoom();
        obj.input();
        obj.calculate();
        obj.display();
    }
}

        
        
    
        
    