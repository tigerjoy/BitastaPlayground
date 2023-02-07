import java.util.Scanner;
class DayNameFromDateQ7
{
  int day,month,year;
  String date;
  int daysInMonth[]={31,28,31,30,31,30,31,31,30,31,30,31};
  String firstDayOfYearName;
  String dayOfWeek[]={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY"
                        ,"THURSDAY","FRIDAY","SATURDAY"};
  void input()
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter date in the format dd/mm/yyyy: ");
    date=sc.next();
    System.out.print("Enter day name of 1st January: ");
    firstDayOfYearName=sc.next();
  }
  boolean isValidFormat()
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
          char ch = date.charAt(i);
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
  boolean isValidDate()
  {
    if(isLeapYear(year))
    {
      daysInMonth[1]=29;
    }
    return (month>=1 && month<=12) && 
          (day<=daysInMonth[month-1]);
  }
  boolean validateDate()
  {
    if(isValidFormat())
    {
      extractDate();
      return isValidDate();
    }
    else
    {
      System.out.println("INVALID FORMAT");
      return false;
    }
  }
  int calcTotalDays()
  {
    int dayNumber=day;
    for(int i=0;i<=month-2;i++)
    {
      dayNumber+=daysInMonth[i];
    }
    return dayNumber;
  }
  int dayNumberFromName(String dayName)
  {
    int pos=-1;
    for(int i=0;i<=dayOfWeek.length-1;i++)
    {
      if(dayOfWeek[i].equalsIgnoreCase(dayName))
      {
        pos=i;
        break;
      }
    }
    return pos;
  }
  void dayNameFromDate()
  {
    int dayOfFirstJan=dayNumberFromName(firstDayOfYearName);
    if(dayOfFirstJan==-1)
    {
      System.out.println("INVALID DAY NAME OF 1ST JAN");
    }
    else
    {
      int totalDays=calcTotalDays();
      int dayWeekNum = (totalDays+dayOfFirstJan-1)%7;
      // Day on 19/11/2022: SATURDAY
      System.out.println("Day on "+date+" : "+dayOfWeek[dayWeekNum]);
    }
  }
  public static void main(String args[])
  {
    DayNameFromDateQ7 obj=new DayNameFromDateQ7();
    obj.input();
    if(obj.validateDate())
    {
      obj.dayNameFromDate();
    }
    else
    {
      System.out.println("INVALID DATE");
    }
  }// End of main()
}// End of class
