// Scored - 7.5 points
import java.util.Scanner;
class CorrectionDateQ4
{
    int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
    String months[]={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
    int dayNum,year,N,date,month;
   
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("DAY NUMBER: ");
        dayNum=sc.nextInt();
        System.out.print("YEAR: ");
        year=sc.nextInt();
        System.out.print("DAY AFTER (N DAYS): ");
        N=sc.nextInt();
    }
    boolean isLeapYear(int year)
    {
        return (year%100==0 && year%400==0) || (year%100!=0 && year%4==0);
    }
    String findDate(int dayNumber, int y)
    {
        int temp=dayNumber;
        if(isLeapYear(y))
        {
          days[1]=29;
        }
        else
        {
          days[1]=28;
        }
        for(int i=0;i<=days.length-1;i++)
        {
            if(temp>days[i])
            {
                temp-=days[i];
            }
            else
            {
                date=temp;
                month=i+1;
                break;
            }
        }
        return (date+" TH "+months[month-1]+", "+year);
    }
    // <condition> ? <true-output> : <false-output>
    int getTotalDaysInYear(int y)
    {
      return isLeapYear(y)?366:365;
    }
    void findDateAfterNDays()
    {
      dayNum+=N;
      int totalDaysInCurrentYear=getTotalDaysInYear(year);
      // If dayNum + N falls in the next year
      if(dayNum>totalDaysInCurrentYear)
      {
        year++;
        dayNum-=totalDaysInCurrentYear;
      }
      System.out.println("DATE AFTER "+N+" DAYS: "+findDate(dayNum,year));
    }
    public static void main(String args[])
    {
        CorrectionDateQ4 obj=new CorrectionDateQ4();
        obj.input();
        if(obj.dayNum>=1 && obj.dayNum<=366)
        {
            if(obj.N>=1 && obj.N<=100)
            {
                // obj.isLeapYear(obj.year);
                System.out.println("DATE: "+
                    obj.findDate(obj.dayNum,obj.year));
                obj.findDateAfterNDays();
            }
            else
            {
                System.out.println("DATE AFTER (N DAYS) OUT OF RANGE");
            }
        }
        else
        {
            System.out.println("DAY NUMBER OUT OF RANGE");
        }
    }//End of main()
}//End of class
            