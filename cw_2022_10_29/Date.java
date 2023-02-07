import java.util.Scanner;
class Date
{
  int n,d,m,y;
  Date()
  {
    n=0;
    d=0;
    m=0;
    y=0;
  }
  void accept()
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of days: ");
    n=sc.nextInt();
    System.out.print("Enter year: ");
    y=sc.nextInt();
  }
  void day_to_date()
  {
    int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
    if((y%100==0 && y%400==0) || (y%100!=0 && y%4==0))
    {
      days[1]=29;
    }
    for(int i=0;i<=days.length-1;i++)
    {
      if(n>days[i])
      {
        n-=days[i];
      }
      else
      {
        d=n;
        m=i+1;
        break;
      }
    }
  }
  void display()
  {
    String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
    System.out.println(months[m-1]+ " " + d + ","+y);
  }
  public static void main(String args[])
  {
    Date obj=new Date();
    obj.accept();
    obj.day_to_date();
    obj.display();
  }//End of main()
}//End of class