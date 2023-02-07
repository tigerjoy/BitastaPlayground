import java.util.Scanner;
class DayOfYearQ3
{
  int day,month,year;
  String date;
  int daysInMonth[]={31,28,31,30,31,30,31,31,30,31,30,31};
  void input()
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter date in the format dd/mm/yyyy: ");
    date=sc.next();
  }
  boolean isValidFormat()
  {
    // System.out.println("Date = "+date);
    // System.out.println("date.length() = "+date.length());
    // System.out.println("date.charAt(2) = "+date.charAt(2));
    // System.out.println("date.charAt(5) = "+date.charAt(5));
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
      //System.out.println("isValid = "+isValid);
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
  public static void main(String args[])
  {
    DayOfYearQ3 obj=new DayOfYearQ3();
    obj.input();
    if(obj.validateDate())
    {
      // It is 17 day of year 2022
      System.out.println("It is "+obj.calcTotalDays()+" day of year "+obj.year);
    }
    else
    {
      System.out.println("INVALID DATE");
    }
  }// End of main()
}// End of class