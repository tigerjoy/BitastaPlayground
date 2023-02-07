// Scored - 5 points
import java.util.*;
public class RailwayTicket
{
    String name, coach;
    long mobno;
    int amt,totalamt;
    // OBSERVATION #1
    // It is commendable that you've written
    // a default constructor here, but was it 
    // asked in the question?
    RailwayTicket()
    {
        name="";
        mobno=0;
        amt=0;
        totalamt=0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name:");
        name=sc.nextLine();
        // Good Job mentioning the options!
        System.out.println("Enter coach:First_AC/Second_AC/Third_AC/Sleeper");
        coach=sc.nextLine();
        System.out.print("Enter mobile no.:");
        mobno=sc.nextLong();
        System.out.print("Enter basic amount:");
        amt=sc.nextInt();
    
    }
    void update()
    {
        if(coach.equals("First_AC"))
        totalamt=amt+700;
        else if(coach.equals("Second_AC"))
        totalamt=amt+500;
        else if(coach.equals("Third_AC"))
        totalamt=amt+200;
        else
        totalamt=amt+0;
    }
    void display()
    {
        System.out.println("NAME:"+name);
        System.out.println("COACH:"+coach);
        System.out.println("MOBILE NO.:"+mobno);
        System.out.println("TOTAL AMOUNT:"+totalamt);
    }
    public static void main(String args[])
    {
        RailwayTicket obj=new RailwayTicket();
        obj.accept();
        obj.update();
        obj.display();
     }
}
    

    
    
    
    
        
   
     