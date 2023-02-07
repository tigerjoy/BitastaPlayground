import java.util.Scanner;
class DateDifferenceQ6
{
  int day1,month1,year1;
  int day2,month2,year2;
  String date1,date2;
  int daysInMonth[]={31,28,31,30,31,30,31,31,30,31,30,31};

  void input()
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter date 1 in dd/mm/yyyy format: ");
    date1=sc.next();
    System.out.print("Enter date 2 in dd/mm/yyyy format: ");  
    date2=sc.next();
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
    String comp1[]=date1.split("/");
    day1=Integer.parseInt(comp1[0]);
    month1=Integer.parseInt(comp1[1]);
    year1=Integer.parseInt(comp1[2]);
    String comp2[]=date2.split("/");
    day2=Integer.parseInt(comp2[0]);
    month2=Integer.parseInt(comp2[1]);
    year2=Integer.parseInt(comp2[2]);

    // System.out.printf("Date 1 - %d-%d-%d\n", day1, month1, year1);
    // System.out.printf("Date 2 - %d-%d-%d\n", day2, month2, year2);
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
      daysInMonth[1]=29;
    }
    return (month>=1 && month<=12) &&
          (day<=daysInMonth[month-1]);
  }
  boolean validateDate()
  {
    if(isValidFormat(date1) && isValidFormat(date2))
    {
      // System.out.println("Both dates are valid");
      extractDate();
      if(isValidDate(day1,month1,year1) &&       
         isValidDate(day2,month2,year2))
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
  int getTotalDaysInYear(int year)
  {
    if(isLeapYear(year))
    {
      return 366;
    }
    else
    {
      return 365;
    }
  }
  long calcTotalDaysFrom1753(int day,int month,int year)
  {
    long total=0;
    // Get all the days from 1753 to year-1
    for(int i=1753;i<=year-1;i++)
    {
      total+=getTotalDaysInYear(i);
    }
    // Get the day of year 
    if(isLeapYear(year))
    {
      daysInMonth[1]=29;
    }
    else
    {
      daysInMonth[1]=28;
    }
    total+=day;
    for(int i=0;i<=month-2;i++)
    {
      total+=daysInMonth[i];
    }
    return total;
  }
  void displayDifference()
  {
    // System.out.println("Days from 1753 for date 1 = " + 
    //               calcTotalDaysFrom1753(day1,month1,year1));
    // System.out.println("Days from 1753 for date 2 = " + 
    //               calcTotalDaysFrom1753(day2,month2,year2));
    System.out.println("Difference = "+
      Math.abs(calcTotalDaysFrom1753(day1,month1,year1)-
              calcTotalDaysFrom1753(day2,month2,year2)));
  }
  public static void main(String args[])
  {
    DateDifferenceQ6 obj=new DateDifferenceQ6();
    obj.input();
    if(obj.validateDate())
    {
      // System.out.println("Both dates are valid");
      if(obj.year1<1753 || obj.year2<1753)
      {
        System.out.println("Cannot handle date before 1753.");
      }
      else
      {
        obj.displayDifference();
      }
    }
    else
    {
      System.out.println("One of the date is invalid.");
    }
  }// End of main()
}// End of class