import java.util.Scanner;
class CalendarPrinterQ8
{
  // Generate calendar starting from this date
  int day,month,year; 
  String monthName;
  int daysInMonth[]={31,28,31,30,31,30,31,31,30,31,30,31};
  String monthNames[]={"JANUARY","FEBRUARY","MARCH","APRIL",
                      "MAY","JUNE","JULY","AUGUST","SEPTEMBER",
                      "OCTOBER","NOVEMBER","DECEMBER"};

  // Day number of 01/01/1753
  final int startDayNum=1;//MON
  final int startYear=1753;
  int monthStartingDay;
  int yearStartingDay;
  
  void input()
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the year: ");
    year=sc.nextInt();
    System.out.print("Enter the name of the month: ");
    monthName=sc.next();
    day=1;
  }
  void getMonthNumber()
  {
    for(int i=0;i<=monthNames.length-1;i++)
    {
      if(monthName.equalsIgnoreCase(monthNames[i]))
      {
        month=i+1;
        break;
      }
    }
  }
  boolean isLeapYear(int year)
  {
    return ((year%100==0 && year%400==0) || 
            (year%100!=0 && year%4==0));
  }
  void getStartingDayOfYear()
  {
    int startDay=startDayNum;
    int currentYear=startYear;
    while(currentYear!=year)
    {
      if(isLeapYear(currentYear))
      {
        startDay=(startDay+2)%7;
      }
      else
      {
        startDay=(startDay+1)%7;
      }
      currentYear++;
    }
    yearStartingDay=startDay;
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
  void getStartingDayOfMonth()
  {
    int totalDays=calcTotalDays();
    monthStartingDay=(totalDays+yearStartingDay-1)%7;
  }
  // monthStartingDay, no. of days in that month
  void displayCalendar()
  {
    int totalDaysInMonth=daysInMonth[month-1];
    String divider = "---------------------------------";
    System.out.println(divider);
    System.out.println("\t\t"+monthNames[month-1]+" "+year);
    System.out.println(divider);
    System.out.println("SUN MON TUE WED THU FRI SAT");
    System.out.println(divider);
    int count=0;
    // Display the blanks
    for(int i=1;i<=monthStartingDay;i++)
    {
      System.out.printf("%-3s "," ");
      count++;
    }
    // Display the calendar days
    for(int i=1;i<=totalDaysInMonth;i++)
    {
      System.out.printf("%-3d ",i);
      count++;
      if(count%7==0)
      {
        System.out.println("\n"+divider);
      }
    }
    if(count%7!=0)
    {
      System.out.println("\n"+divider);
    }
  }
  public static void main(String args[])
  {
    CalendarPrinterQ8 obj=new CalendarPrinterQ8();
    obj.input();
    if(obj.year<1753)
    {
      System.out.println("Cannot display calendar for years before 1753.");
    }
    else
    {
      obj.getMonthNumber();
      if(obj.month==0)
      {
        System.out.println("Invalid name of month.");
      }
      else
      {
        obj.getStartingDayOfYear();
        obj.getStartingDayOfMonth();
        obj.displayCalendar();
      }
    }
  } //End of main
}// End of class
