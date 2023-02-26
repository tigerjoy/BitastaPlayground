import java.util.Scanner;
class DateProgram
{
  String date, firstDayOfJan;
  int dayInMonth[]={31,28,31,30,31,30,31,31,30,31,30,31};
  String daysInWeek[]={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY"
                        ,"THURSDAY","FRIDAY","SATURDAY"};
  int day,month,year;
  void input()//to take input
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("DATE: ");
    date=sc.next();
    System.out.print("Day on 1st January: ");
    firstDayOfJan=sc.next().toUpperCase();
  }
  boolean isValidFormat()//to check the format
  {
    int count=0;
    for(int i=0;i<=date.length()-1;i++)
    {
        if(date.charAt(i)=='/')
        {
            count++;
        }
    }
    if(count!=2)
    {
        return false;
    }
    else
    {
      boolean isValid=true;
      for(int i=0;i<=date.length()-1;i++)
      {
          char ch = date.charAt(i);
          if(!Character.isDigit(ch) && ch!='/')
          {
            isValid=false;
            break;
          }
      }
      return isValid;
    }
  }
  void extractDate()//to extract date
  {
    String comp[]=date.split("/");
    day=Integer.parseInt(comp[0]);
    month=Integer.parseInt(comp[1]);
    year=Integer.parseInt(comp[2]); 
  }
  boolean isLeapYear(int year)// to check if it is a leap year
  {
    return ((year%100==0 && year%400==0) || 
            (year%100!=0 && year%4==0));
  }
  boolean isValidDate()//to check if date is valid
  {
    if(isLeapYear(year))
    {
      dayInMonth[1]=29;
    }
    return (month>=1 && month<=12) && 
          (day<=dayInMonth[month-1]);
  }
  boolean validateDate()//to validate the date
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
  int calcTotalDays()//to calculate the number of days
  {
    int dayNumber=day;
    for(int i=0;i<=month-2;i++)
    {
      dayNumber+=dayInMonth[i];
    }
    return dayNumber;
  }
  int dayNumberFromName(String dayName)//to find the number
  {
    int pos=-1;
    for(int i=0;i<=daysInWeek.length-1;i++)
    {
      if(daysInWeek[i].equals(dayName))
      {
        pos=i;
        break;
      }
    }
    return pos;
  }
  void dayNameFromDate()//to find the day
  {
    int dayOfFirstJan=dayNumberFromName(firstDayOfJan);
    if(dayOfFirstJan==-1)
    {
      System.out.println("INVALID DAY");
    }
    else
    {
      int totalDays=calcTotalDays();
      int num = (totalDays+dayOfFirstJan-1)%7;
      System.out.println("Day on "+date+" : "+daysInWeek[num]);
    }
  }
  public static void main(String args[])
  {
    DateProgram obj=new DateProgram();
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
