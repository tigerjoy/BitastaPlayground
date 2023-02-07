import java.util.Scanner;
class DateValidate
{
  String date;
  int day,month,year;
  int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
  
  void input()
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the date in dd/mm/yyyy format: ");
    date=sc.next();
  }

  boolean isValidFormat()
  {
    boolean slashValid = false;
    boolean lengthValid = false;
    boolean allDigits = true;
    // Check if / are present at index 2 and 5
    if(date.charAt(2)=='/'&& date.charAt(5)=='/')
    {
      slashValid = true;
    }
    else 
    {
      System.out.println("/(s) are at incorrect positions.");
    }

    // Check if length is 10
    if(date.length()==10)
    {
      lengthValid = true;
    } 
    else
    {
      System.out.println("Length of the date should be 10.");
    }

    // Check if only digits are present at indexes
    // other than 2 and 5
    for(int i=0;i<=date.length()-1;i++)
    {
      if(i==2 || i==5)
      {
        continue;
      }
      if(Character.isDigit(date.charAt(i)) == false)
      {
        allDigits = false;
        break;
      }
    }

    if (allDigits == false)
    {
      System.out.println("Date must only contain digits.");  
    }

    return slashValid && lengthValid && allDigits;
  }

  // Extract the components of a date
  void extractDate()
  {
    String comp[]=date.split("/");
    day=Integer.parseInt(comp[0]);
    month=Integer.parseInt(comp[1]);
    year=Integer.parseInt(comp[2]);
  }

  boolean isLeapYear(int year)
  {
    if((year%100==0 && year%400==0) || 
       (year%100!=0 && year%4==0))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  boolean isValidDate()
  {
    if(isLeapYear(year))
    {
      days[1]=29;
    }
    if(month<=12)
    {
      if(day<=days[month-1])
      {
        return true;
      }
      else
      {
        System.out.println("Invalid day");
      }
    }
    else
    {
      System.out.println("Invalid month");
    }
    return false;
  }
  public static void main(String args[])
  {
    DateValidate obj=new DateValidate();
    obj.input();
    if(obj.isValidFormat())
    {
      obj.extractDate();
      if(obj.isValidDate())
      {
        System.out.println("Valid date");
      }
      else
      {
        System.out.println("Invalid date");
      }
    }
    else
    {
      System.out.println("Invalid format");
    }
  }//End of main()
}//End of class