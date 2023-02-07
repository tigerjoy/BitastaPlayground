class Test 
{
  boolean isValidFormat()
  {
    // Check if / are present at index 2 and 5
    if(date.charAt(2) != '/' || date.charAt(5) != '/')
    {
      return false;
    }
    // Check if length is 10
    else if(date.length()!=10)
    {
      return false;
    } 
    // Check if only digits are present at indexes
    // other than 2 and 5
    else 
    {
      for(int i=0;i<=date.length()-1;i++)
      {
        if(i==2 || i==5)
        {
          continue;
        }
        if(Character.isDigit(date.charAt(i)) == false)
        {
          return false;
        }
      }
    }
    return true;
  }

  boolean isValidDate()
  {
    if(isLeapYear(year))
    {
      days[1]=29;
    }
    return (month <= 12) && (day<=days[month-1]);
  }
}