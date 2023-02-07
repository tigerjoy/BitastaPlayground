import java.util.*;
public class Student
{
    String name;
    int age, marks1, marks2, marks3, maximum;
    double average;
    Student()
    {
        name="";
        age=0;
        marks1=0;
        marks2=0;
        marks3=0;
        maximum=0;
        average=0.0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NAME OF THE STUDENT:");
        name=sc.nextLine();
        System.out.println("ENTER AGE OF THE STUDENT:");
        age=sc.nextInt();
        System.out.println("ENTER MARKS OF FIRST SUBJECT:");
        marks1=sc.nextInt();
        System.out.println("ENTER MARKS OF SECOND SUBJECT:");
        marks2=sc.nextInt();
        System.out.println("ENTER MARKS OF THIRD SUBJECT:");
        marks3=sc.nextInt();
    }
    void compute()
    {
        int max=(int)Math.max(marks1,marks2);
        maximum=(int)Math.max(max,marks3);
        int t=marks1+marks2+marks3;
        average=t/3;
    }
    void display()
    {
       System.out.println("NAME OF THE STUDENT:"+name);
       System.out.println("AGE:"+age);
       System.out.println("MAXIMUM MARKS:"+maximum);
       System.out.println("AVERAGE MARKS:"+average);
    }
    public static void main(String args[])
    {
        Student obj=new Student();
        obj.input();
        obj.compute();
        obj.display();
    }
}

        
        
    
        
    
    