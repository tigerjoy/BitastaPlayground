import java.util.*;
public class Telephone
{
    int prv, pre;
    String name;
    int call;
    double amt;  
    double total; 
    Telephone()
    {
        prv=0;
        pre=0;
        call=0;
        name="";
        amt=0.0;
        total=0.0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NAME:");
        name=sc.nextLine();
        System.out.println("ENTER THE PREVIOUS METER READING:");
        prv=sc.nextInt();
        System.out.println("ENTER THE PRESENT METER READING:");
        pre=sc.nextInt();
    }
    void cal()
    {
        call=pre-prv;
        if(call<=100)
        {
            amt=100*0;
        }
        else if(call>100 && call<=200)
        {
            amt=(90.0/100.0)*(call-100);
        }
        else if(call>200 && call<=400)
        {
            amt=100*(90.0/100.0)+(call-200)*(80.0/100.0);
        }
        else if(call>400)
        {
            amt=100*(90.0/100.0)+200*(80.0/100.0)+(amt-400)*(70.0/100.0);
        }
        total=amt+180;
    }
    void display()
    {
       System.out.println("NAMES"+"\t"+"CALLS MADE"+"\t"+"AMOUNT"+"\t"+"TOTAL AMOUNT");
       System.out.println(name+"\t\t"+call+"\t"+amt+"\t"+total);
    }
    public static void main(String args[])
    {
        Telephone obj=new Telephone();
        obj.input();
        obj.cal();
        obj.display();
    }
}

        
        
