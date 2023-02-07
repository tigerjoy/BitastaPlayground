import java.util.*;
class Mobike
{
    int bno,phno=0,days,charge;
    String name="";
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of the customer : ");
        name=sc.nextLine();
        System.out.println("Enter bike number : ");
        bno=sc.nextInt();
        System.out.println("Enter phone number : ");

        System.out.println("Number of days taken for rent : ");
        days=sc.nextInt();
    }
    
    public void compute()
    {
        if(days>=1 &&  days<=5)
        {
          charge=500*days;
        }
        else if(days >5 && days<=10)
        {
          charge=400*days;
        }
        else
        {
          charge=200*days;
        }
          System.out.println("Charge : "+charge);
    }
    
    public void display()
    {
        System.out.println("Bike number : "+bno);
        System.out.println("Phone number : "+phno);
        System.out.println("No of days taken for rent : "+days);
        System.out.println("Charge : "+charge);
    }
}
