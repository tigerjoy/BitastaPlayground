import java.util.*;
public class Library
{
    int acc_num;
    String title;
    String author;
    Library()
    {
        acc_num=0;
        title="";
        author="";
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER BOOK NAME:");
        title=sc.nextLine();
        System.out.println("ENTER THE AUTHOR NAME:");
        author=sc.nextLine();
        System.out.println("ENTER ACCESSION NUMBER:");
        acc_num=sc.nextInt();
    }
    void calculate()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF DAYS LATE:");
        int days=sc.nextInt();
        int fine=days*2;
        System.out.println("THE FINE CHARGED:"+fine);
    }
    void display()
    {
       System.out.println("ACCESSION NUMBER"+"\t"+"TITLE"+"\t"+"AUTHOR");
       System.out.println(acc_num+"\t\t"+title+"\t"+author);
    }
    public static void main(String args[])
    {
        Library obj=new Library();
        obj.input();
        obj.calculate();
        obj.display();
    }
}

        
        
    
        
    
    
