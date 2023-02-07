// Scored - 5 points
import java.util.*;
public class BookFair
{
    String bname;
    double price, dis;
    BookFair()
    {
        bname="";
        price=0.0;
        dis=0.0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER BOOK NAME:");
        bname=sc.nextLine();
        System.out.println("ENTER PRICE OF THE BOOK:");
        price=sc.nextLong();
    }
    // OBSERVATION #1
    // Calculate can calculate the discounted price
    // without needing the dis variable altogether.
    // The situation here is not like in Taximeter.
    void calculate()
    {
        if(price<=1000)
        {
            dis=price*2/100.0;
            price=price-dis;
        }
        else if(price>1000 && price<=3000)
        {
            dis=price*10/100;
            price=price-dis;
        }
        else 
        {
            dis=price*15/100;
            price=price-dis;
        }
    }
    void display()
    {
       System.out.println("NAME OF THE BOOK:"+bname);
       System.out.println("PRICE OF THE BOOK:"+price);
    }
    public static void main(String args[])
    {
        BookFair obj=new BookFair();
        obj.input();
        obj.calculate();
        obj.display();
    }
}

        
        
    
        
    
    