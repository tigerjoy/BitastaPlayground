// Scored - 7.5 points
import java.util.Scanner;
class DateQ4
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
    void findDate()
    {
        int temp=dayNum;
        if(isLeapYear(year))
        {
            days[1]=29;
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
        System.out.println("DATE : "+date+" TH "+months[month-1]+", "+year);
    }
    void findDateAfterNDays()
    {
        dayNum+=N;
        if((!isLeapYear(year) && dayNum<=365) || (isLeapYear(year) && dayNum<=366))
        {
            for(int i=0;i<=days.length-1;i++)
            {
                if(dayNum>days[i])
                {
                    dayNum-=days[i];
                }
                else
                {
                    date=dayNum;
                    month=i+1;
                    break;
                }
            }
            System.out.println("DATE AFTER "+N+" DAYS: "+date+" TH "+months[month-1]+", "+year);
        }
        else
        {
            if(!isLeapYear(year) && dayNum>365)
            {
                dayNum=dayNum-365;
            }
            else if(isLeapYear(year) && dayNum>366)
            {
                dayNum=dayNum-366;
            }
            if(isLeapYear(year))
            {
                days[1]=29;
            }
            else
            {
                days[1]=28;
            }
          // Repitition of the same code
            for(int i=0;i<=days.length-1;i++)
            {
                if(dayNum>days[i])
                {
                    dayNum-=days[i];
                }
                else
                {
                    date=dayNum;
                    month=i+1;
                    break;
                }
            }
          // The output statement is not
          // w.r.t question
            System.out.println("DATE : "+date+" TH "+months[month-1]+", "+(year+1));
        }
    }
    public static void main(String args[])
    {
        DateQ4 obj=new DateQ4();
        obj.input();
        if(obj.dayNum>=1 && obj.dayNum<=366)
        {
            if(obj.N>=1 && obj.N<=100)
            {
                obj.isLeapYear(obj.year);
                obj.findDate();
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
            