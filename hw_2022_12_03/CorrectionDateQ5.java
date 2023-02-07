// Scored - 6.5 points
import java.util.Scanner;
class CorrectionDateQ5
{
    String date;
    int day,month,year,dayNum;
    int N;
    int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter date in the dd/mm/yyyy format: ");
        date=sc.next();
        System.out.print("Enter number of days after: ");
        N=sc.nextInt();
    }
    boolean isValidFormat(String date)
    {
        if(date.length()!=10)
        {
            return false;
        }
        else if(date.charAt(2)!='/' || date.charAt(5)!='/')
        {
            return false;
        }
        else
        {
            boolean isValid=true;
            for(int i=0;i<=date.length()-1;i++)
            {
                if(i==2 || i==5)
                {
                    continue;
                }
                else
                {
                    char ch=date.charAt(i);
                    if(!Character.isDigit(ch))
                    {
                        isValid=false;
                        break;
                    }
                }
            }
            return isValid;
        }
    }
    void extractDate()
    {
        String comp[]=date.split("/");
        day=Integer.parseInt(comp[0]);
        month=Integer.parseInt(comp[1]);
        year=Integer.parseInt(comp[2]);
    }
    boolean isLeapYear(int year)
    {
        return ((year%100==0 && year%400==0) || 
            (year%100!=0 && year%4==0));
    }
    boolean isValidDate(int day,int month,int year)
    {
        if(isLeapYear(year))
        {
            days[1]=29;
        }
        return (month>=1 && month<=12) &&
             (day<=days[month-1]);
    }
    boolean validateDate()
    {
        if(isValidFormat(date))
        {
            extractDate();
            if(isValidDate(day,month,year))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            System.out.println("Invalid format.");
            return false;
        }
    }
    void numberOfDays()
    {
        for(int i=0;i<=month-2;i++)
        {
            dayNum+=days[i];
        }
        dayNum+=day;
    }
    int getTotalDaysInYear(int year)
    {
      return (isLeapYear(year)?366:365);
    }
    void findDateAfterNDays()
    {
      dayNum+=N;
      int totalDaysInCurrentYear=getTotalDaysInYear(year);
      if(dayNum>totalDaysInCurrentYear)
      {
        year++;
        dayNum-=totalDaysInCurrentYear;
      }
      if(isLeapYear(year))
      {
        days[1]=29;
      }
      else
      {
        days[1]=28;
      }
      for(int i=0;i<=days.length-1;i++)
      {
          if(dayNum>days[i])
          {
              dayNum-=days[i];
          }
          else
          {
              day=dayNum;
              month=i+1;
              break;
          }
      }
      System.out.println("Future date: "+day+"/"+month+"/"+year);
    }
    public static void main(String args[])
    {
        CorrectionDateQ5 obj=new CorrectionDateQ5();
        obj.input();
        if(obj.validateDate())
        {
            System.out.println("Entered date: "+obj.date);
            // Where are you displaying the entered date
            obj.numberOfDays();
            obj.findDateAfterNDays();
        }
    }//End of main()
}//End of class
        